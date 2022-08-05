package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample4_Oracle_Insert_direct {
	public static void main(String args[]) {
		
		Connection conn =null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			
			/*
			 * 1.직접 데이터를 입력하는 경우
			 * insert into goodsinfo
			 * values('A1000','고급 핸드폰', 100, 'LG'
			 */
			String sql = "insert into goodsinfo "
					   + "values('A1000', '고급 핸드폰', 100, 'LG')";
			stmt = conn.createStatement();
			
			System.out.println(sql);
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "행이 추가되었습니다.");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
			}
			try {
				if (conn != null)
					conn.close(); //4단계 : DB연결을 끊는다.
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
			
			}
		}//fianlly
	}

}

