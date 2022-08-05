package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample5_Oracle_delete {
	public static void main(String args[]) {
		// "A2000" "�����" 200 "�Ｚ"
		if (args.length != 1) {
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
			String del_sql = "delete from goodsinfo " 
						   + "where code = " + single + args[0] + single;
						   System.out.println(del_sql);
						   
			int rowNum = stmt.executeUpdate(del_sql);

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
