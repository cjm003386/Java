package ex22_4_5_PreparedStatement_test;

import java.sql.*;

public class JDBCExample4_Oracle3_PreparedStatement_delete {
	public static void main(String args[]) {
		// "A5000"
		if (args.length != 1) {
			System.out.println("��ǰ �ڵ� �Է��ϼ���");
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

			System.out.println(rowNum + "���� ���� �Ǿ����ϴ�.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
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
					conn.close(); // 4�ܰ� : DB������ ���´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
