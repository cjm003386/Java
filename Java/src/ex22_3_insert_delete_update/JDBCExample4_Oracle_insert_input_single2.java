package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample4_Oracle_insert_input_single2 {
	public static void main(String args[]) {
		// "A2000" "�����" 200 "�Ｚ"
		if (args.length != 4) {
			System.out.println("��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
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
			String sql = "insert into goodsinfo " 
					+ "(code, name, price, maker) " 
					+ "values" + "(" + single + args[0]
					+ single + ", " // varchar2 �ڷ���
					+ single + args[1] + single + ", " + args[2] + ", " + single + args[3] + single + ")";

			System.out.println(sql + "\n");
			int rowNum = stmt.executeUpdate(sql);

			System.out.println(rowNum + "���� �߰��Ǿ����ϴ�.");

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
