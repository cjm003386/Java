package ex22_4_1_select_statement_dao;

import java.sql.*;
import java.util.*;

public class DAO2 {
	public ArrayList<Map<String, Object>> selectAll() {
		ArrayList<Map<String, Object>> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2�ܰ�: DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");

			/*
			 * ������ ���̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ��մϴ�. 2�ܰ迡�� ���� Connection ��ü�� ����
			 * createStatement �޼ҵ带 ȣ���ؼ� ����ϴ�.
			 */
			stmt = conn.createStatement();

			/*
			 * Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸����� select���� �����ϴ� executeQuery��� �޼ҵ尡
			 * �ֽ��ϴ�. �� �޼ҵ忡 �Ķ���ͷ� select ������ �Ѱ��־�� �մϴ�. �� �޼ҵ�� �Ķ���ͷ� �Ѱ��� select ���� ������ ���̽���
			 * ������ �����ϰ� �� ����� Resultset ��ü�� �����մϴ�.
			 */
			String select_sql = "select*from emp";
			rs = stmt.executeQuery(select_sql);

			System.out.println("��ȣ\t�����ȣ\t����̸�\t����\t\t���\t�Ի���\t\t�޿�\tĿ�̼�\t�μ���ȣ");
			for (int i = 0; i < 100; i++) {
				System.out.print("-");
			}
			System.out.println();

			/*
			 * ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ���� next() �޼ҵ带 ȣ���ؾ� �մϴ�. rs.next()-
			 * ���� �� ��ġ�� �̵��ϴ� �޼ҵ� ���� ���� boolean���� ������ ���� �о� �Դ��� �����Դϴ�.
			 */
			int i = 0;
			while (rs.next()) { // �� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				if(i++==0) {
					list = new ArrayList<Map<String, Object>>();
				}
				HashMap<String, Object> map = new HashMap<String,Object>();
				map.put("Empno",rs.getInt(1));
				map.put("Ename",rs.getString(2));
				map.put("Job",rs.getString(3));
				map.put("Mgr",rs.getInt(4));
				map.put("Hiredate",rs.getDate(5));
				map.put("Sal",rs.getInt(6));
				map.put("Comm",rs.getInt(7));
				map.put("Deptno",rs.getInt(8));
				list.add(map);
			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
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
					conn.close(); // 4�ܰ� : DB������ ���´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}//finally
		
		return list;
		//return null;
	}

}
