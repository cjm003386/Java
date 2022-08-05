package ex22_1_Connect_test;
import java.sql.*;
public class JDBCExample2_Oracle {
	public static void main(String args[]) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			
			/* ������ ���̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ��մϴ�.
			 * 2�ܰ迡�� ���� Connection ��ü�� ���� createStatement �޼ҵ带 ȣ���ؼ� ����ϴ�.
			 */
			stmt = conn.createStatement();
			
			/* Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			 * select���� �����ϴ� executeQuery��� �޼ҵ尡 �ֽ��ϴ�.
			 * �� �޼ҵ忡 �Ķ���ͷ� select ������ �Ѱ��־�� �մϴ�.
			 * �� �޼ҵ�� �Ķ���ͷ� �Ѱ��� select ���� ������ ���̽���
			 * ������ �����ϰ� �� ����� Resultset ��ü�� �����մϴ�.
			 */
			String select_sql="select*from dept";
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ\t�μ���ȣ\t�μ���\t\t����");
			System.out.println("-------------------------------------------------");
			
			int i = 0;
			while(rs.next()) { //�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				//getInt("deptno") : Į�� deptno ���� int ������ �����ϴ� �޼ҵ�
				int deptno = rs.getInt("deptno");
				
				//getString("dname") : �÷� dname ���� String ������ �����ϴ� �޼ҵ�
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.printf("%5d\t%5d\t%-15s%s\n", ++i, deptno, dname, loc);
			}
			
		}catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if (rs != null)
					rs.close();
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
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
