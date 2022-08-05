//글 등록하기
package ex23_Board_main;

import java.sql.*;
import java.util.*;

public class BoardDAO_seq {
	
	public BoardDAO_seq() {
		
	}
	
	public int count() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="select count(*) from board";
		int count = 0;
		 try {
	    	   String driver = "oracle.jdbc.driver.OracleDriver";
				Class.forName(driver);
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "board", "1234");
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					count = rs.getInt(1);
				}
	}catch (Exception ex) {
		ex.printStackTrace();
		System.out.println("getBoardList() 에러 : " + ex);
	}finally {
		try {
			if(rs!=null)
				rs.close();
		}catch (SQLException ex){
			ex.printStackTrace();
		}
			
		}
		 return count;
	}
	

	
	
	public int boardDelete(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String board_delete_sql =
				"delete from board"
				+" 				where  BOARD_RE_REF = ?"
				+"				and    BOARD_RE_LEV >=?"
				+"				and    BOARD_RE_SEQ >=?"
				+"				and    BOARD_RE_SEQ <=( " 
				+"									nvl((SELECT min(board_re_seq)-1"
				+"                             			FROM   BOARD"
				+"                             			WHERE  BOARD_RE_REF=?"
				+"                             			AND    BOARD_RE_LEV=?"
				+"                             			AND    BOARD_RE_SEQ>?) ," 
				+"                            			(SELECT max(board_re_seq)"
				+"                            			FROM   BOARD"
				+"										WHERE  BOARD_RE_REF=? ))"
                +"                        )";
		int result =0;
		
       try {
    	   String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			pstmt = conn.prepareStatement(board_delete_sql);
			
			pstmt.setInt(1,  board.getBOARD_RE_REF());
			pstmt.setInt(2,  board.getBOARD_RE_LEV());
			pstmt.setInt(3,  board.getBOARD_RE_SEQ());
			pstmt.setInt(4,  board.getBOARD_RE_REF());
			pstmt.setInt(5,  board.getBOARD_RE_LEV());
			pstmt.setInt(6,  board.getBOARD_RE_SEQ());
			pstmt.setInt(7,  board.getBOARD_RE_REF());
			
			//쿼리 실행 후 삭제된 로우(레코드) 갯수가 반환됩니다.
			result = pstmt.executeUpdate();
    	   
       } catch(Exception ex) {
    	   ex.printStackTrace();
    	   System.out.println("boardDelete() 에러: " + ex);
       } finally {
    	   if(pstmt != null)
    		   try {
    			   pstmt.close();
    		} catch (SQLException ex) {
    			ex.printStackTrace();
    		}
    	   if(conn != null)
    		   try {
    			   conn.close();
    		   } catch (SQLException ex) {
    			   ex.printStackTrace();
    		   }
       }
                                        
		return result;
	}//boardDelete() 메서드 end
	
	//글 답변
	public int boardReply(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		int result = 0;
		
		/*답변을 할 원문 글 그룹 번호입니다.
		 * 답변을 달게 되면 답변 글은 이 번호와 같은 관련글 번호를 갖게 처리되면서
		 * 같은 그룹에 속하게 됩니다. 글 목록에서 보여줄때 하나의 그룹으로 묶여서 출력됩니다.
		*/
		int re_ref = board.getBOARD_RE_REF();
		
		/* 답글의 깊이를 의미합니다.
		 * 원문에 대한 답글이 출력될 때 한 번 들여쓰기 처리가 되고 답글에 대한 답글은 들여쓰기가 두 번 처리되게
		 * 합니다. 원문인 경우에는 이 값이 0이고 원문의 답글은 1, 답글의 답글은 2가 됩니다.
		 * */
		
		int re_lev = board.getBOARD_RE_LEV();
		
		//같은 관련 글 중에서 해당 글이 출력되는 순서입니다.
		int re_seq = board.getBOARD_RE_SEQ();
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			
			//트랜잭션을 이용하기 위해서 setAutoCommit을 false로 설정합니다.
			conn.setAutoCommit(false);
			
			//BOARD_RE_REF, BOARD_RE_SEQ 값을 확인하여 원문 글에 다른 답글이 있으면
			//다른 답글들의 BOARD_RE_SEQ값을 1 씩 증가시킵니다.
			//현재 글을 다른 답글보다 앞에 출력되게 하기 위해서 입니다.
			sql = " update board " 
				     + "set    BOARD_RE_SEQ = BOARD_RE_SEQ + 1 " 
					 + "where  BOARD_RE_REF = ? "
				  	 + "and    BOARD_RE_SEQ > ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
			pstmt.executeUpdate();
			pstmt.close();
			
			// 등록할 답변 글의 BOARD_RE_LEV, BOARD_RE_SEQ 값을 원문 글보다 1씩 증가시킵니다.
			re_seq = re_seq +1;
			re_lev = re_lev +1;
			
			 sql = "insert into board " 
				     + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					 + " BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF," 
				     + " BOARD_RE_LEV, BOARD_RE_SEQ,"
					 + " BOARD_READCOUNT,BOARD_DATE) " 
				     + "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";  
			 
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, board.getBOARD_NAME());
			 pstmt.setString(2, board.getBOARD_PASS());
			 pstmt.setString(3, board.getBOARD_SUBJECT());
			 pstmt.setString(4, board.getBOARD_CONTENT());
			 pstmt.setString(5, ""); //답변에는 파일을 업로드하지 않습니다.
			 pstmt.setInt(6, re_ref);
			 pstmt.setInt(7, re_lev);
			 pstmt.setInt(8, re_seq);
			 pstmt.setInt(9, 0); //BOARD_READCOUNT (조회수)는 0
			 result = pstmt.executeUpdate();
			 conn.commit(); //commit합니다.
		
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(" boardRepl() 에러" + ex);
			try {
				if(conn != null)
					conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}finally {
			
			try {
				if(pstmt !=null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	return result;
}
	
//글내용보기
	public Board getDetail(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board board = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			pstmt = conn.prepareStatement("select * from board where BOARD_NUM = ?");
			pstmt.setInt(1,  num);
			rs= pstmt.executeQuery();
			
			if (rs.next()) {
				board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));//비밀번호 확인시 사용됩니다.
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				//board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
				
			}
			
		} catch (Exception ex) {
			System.out.println(" getDetail() 에러" + ex);
			ex.printStackTrace();
		} finally {
			try {
				if(rs!=null)
					rs.close();
				}catch (SQLException ex) {
					ex.printStackTrace();
				}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();

			}

		}
		return board;
		

	}//getDetail()메서드 end

	
	public int boardModify(Board modifyboard) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql_update = "update board"
						+" set 		BOARD_SUBJECT = ? , "
				        +" 			BOARD_CONTENT = ?"
						+" where 	BOARD_NUM = ?";

		try {

			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");


			// 새로운 글을 등록하는 부분입니다.
			pstmt = conn.prepareStatement(sql_update);
			pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
			pstmt.setString(2, modifyboard.getBOARD_CONTENT());
			pstmt.setInt(3, modifyboard.getBOARD_NUM());
			
			result = pstmt.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardupdate() 에러 :" + ex);
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();

			}
		}

		return result;

	}//boardModify() 메서드 end
	


	
	
	
	//글 목록 보기
	public List<Board> getBoardList(int page, int limit) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// page : 페이지
		// limit : 페이지 당 목록의 수
		
		String sql_select = 
				  "select * "
				+ "from " 
		        + "     (select rownum rnum,BOARD_NUM,BOARD_NAME,"
				+ "             BOARD_SUBJECT, BOARD_CONTENT,BOARD_FILE," 
		        + "             BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ,"
				+ "             BOARD_READCOUNT,BOARD_DATE from " 
		        + "                                           (select * from board "
				+ "                                            order by BOARD_RE_REF desc,"
				+ "                                            BOARD_RE_SEQ asc)"
				+ "      where rownum<=?) " 
				+ "where rnum>=? and rnum<=?";

		
		List<Board> list = null;
		// 한 페이지당 10개씩 목록인 경우 1페이지, 2페이지, 3페이지, 4페이지...
		int startrow = (page - 1) * limit + 1; // 읽기 시작할 row 번호(1 11 21 31...
		int endrow = startrow + limit - 1; // 읽을 마지막 row 번호 (10 20 30 40...
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			pstmt = conn.prepareStatement(sql_select);
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);
			rs = pstmt.executeQuery();
			
			int count = 0;
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복
				if (count++ == 0) {
					list = new ArrayList<Board>();
				}
				Board board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
				list.add(board); // 값을 담은 객체를 리스트에 저장합니다.
			}

			return list; // list를 호출한 곳으로 가져갑니다.
			
		} catch (Exception ex) {
			System.out.println(" getBoardList 에러" + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();

			}

		}
		return null;

	}
	

	
	public int boardInsert(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {

			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");

			String sql_insert = "insert into board" 
					+ 			" (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ 			" BOARD_CONTENT, BOARD_RE_REF," 
					+ 			" BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT, " 
					+ 			" BOARD_DATE)"
					+ 			" values(board_seq.nextval, ?,?,?," 
					+ 					" ? , board_seq.nextval," 
					+ 					" ?,?,?," // 0,0,0
					+					 " sysdate)";

			// 새로운 글을 등록하는 부분입니다.
			pstmt = conn.prepareStatement(sql_insert);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());

			// 원문의 경우 BOARD_RE_LEV, BOARD_RE_SEQ 필드 값은 0입니다.
			pstmt.setInt(5, 0); // BOARD_RE_LEV 필드
			pstmt.setInt(6, 0); // BOARD_RE_SEQ 필드
			pstmt.setInt(7, 0); // BOARD_READCOUNT 필드

			result = pstmt.executeUpdate();

		} catch (Exception ex) {
			System.out.println("boardInset() 에러 :" + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();

			}
		}

		return result;

	}





	



}
