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
			 * 1.���� �����͸� �Է��ϴ� ���
			 * insert into goodsinfo
			 * values('A1000','��� �ڵ���', 100, 'LG'
			 */
			String sql = "insert into goodsinfo "
					   + "values('A1000', '��� �ڵ���', 100, 'LG')";
			stmt = conn.createStatement();
			
			System.out.println(sql);
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "���� �߰��Ǿ����ϴ�.");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
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
					conn.close(); //4�ܰ� : DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
			
			}
		}//fianlly
	}

}

