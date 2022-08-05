package ex22_4_5_PreparedStatement_test;

import java.sql.*;

public class JDBCExample5_Oracle4_PreparedStatement_update {
	public static void main(String args[]) {
		//"10001 update"
		if (args.length != 2) {
			System.out.println("��ǰ�ڵ�,�����縦 �Է��ϼ���");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			String up_sql = "update goodsinfo" 
					+ " set maker = ?"
					+ " where code = ?";
			
			pstmt = conn.prepareStatement(up_sql);

			pstmt.setString(1,args[0]); //"MSI"
			pstmt.setString(2,args[1]); //"10001"
			int rowNum = pstmt.executeUpdate();

			System.out.println(rowNum + "���� �����Ǿ����ϴ�.");

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
