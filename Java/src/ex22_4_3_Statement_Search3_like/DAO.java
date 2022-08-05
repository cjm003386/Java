package ex22_4_3_Statement_Search3_like;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

public class DAO {
	public ArrayList<Emp> search(int col_index, String searchword) {
		ArrayList<Emp> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String column_name[] = { "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno" };
		String sql = "select * from emp ";

		
		if(col_index != 8) {//8�� ���� �ǹ�
			sql += " where ";
			sql += column_name[col_index] + " like " + "'%" + searchword + "%'";
		}
		System.out.println(sql.toString());
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
					rs = stmt.executeQuery(sql);

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
						if (i++ == 0) {
							list = new ArrayList<Emp>();
						}
						Emp st = new Emp();
						st.setEmpno(rs.getInt(1));
						st.setEname(rs.getString(2));
						st.setJob(rs.getString(3));
						st.setMgr(rs.getInt(4));
						st.setHiredate(rs.getDate(5));
						st.setSal(rs.getInt(6));
						st.setComm(rs.getInt(7));
						st.setDeptno(rs.getInt(8));
						list.add(st);
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
				} // finally

				return list;
				// return null;
			}

		
	}


