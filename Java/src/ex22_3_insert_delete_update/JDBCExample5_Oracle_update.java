package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample5_Oracle_update {
	public static void main(String args[]) {
		// "A2000" "�����" 200 "�Ｚ"
		if (args.length != 2) {
			System.out.println("��ǰ�ڵ� �Է��ϼ���");
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

			System.out.println(rowNum + "���� �����Ǿ����ϴ�.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
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
					conn.close(); // 4�ܰ� : DB������ ���´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
