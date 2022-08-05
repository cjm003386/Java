package ex22_1_Connect_test;
import java.sql.*;
public class JDBCExample1_Oracle {
	public static void main(String args[]) {
		Connection conn =null;
		try {
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			
			//3�ܰ�: �޽��� ��� ��ɹ����� ��ü
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if(conn!=null)
					conn.close(); //4�ܰ�: DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
