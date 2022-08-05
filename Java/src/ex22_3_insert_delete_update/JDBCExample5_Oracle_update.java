package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample5_Oracle_update {
	public static void main(String args[]) {
		// "A2000" "모니터" 200 "삼성"
		if (args.length != 2) {
			System.out.println("상품코드 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			stmt = conn.createStatement();

			String single = "'";
			String up_sql = "update goodsinfo " 
						   + "set maker = " + single + args[0] + single
						   + "where code =" + single + args[1] + single;
						   
			System.out.println(up_sql);
						   
			int rowNum = stmt.executeUpdate(up_sql);

			System.out.println(rowNum + "행이 수정되었습니다.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());

			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
