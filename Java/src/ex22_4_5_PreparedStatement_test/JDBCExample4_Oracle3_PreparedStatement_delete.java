package ex22_4_5_PreparedStatement_test;

import java.sql.*;

public class JDBCExample4_Oracle3_PreparedStatement_delete {
	public static void main(String args[]) {
		// "A5000"
		if (args.length != 1) {
			System.out.println("상품 코드 입력하세요");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");

			String del_sql
			= "delete from goodsinfo "
			+ "where code = ?";
			pstmt= conn.prepareStatement(del_sql);
			pstmt.setString(1, args[0]);
			int rowNum = pstmt.executeUpdate();

			System.out.println(rowNum + "행이 삭제 되었습니다.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
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
