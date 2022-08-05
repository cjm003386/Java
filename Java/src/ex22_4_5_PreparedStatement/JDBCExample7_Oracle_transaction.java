//ó�� ���� - db �ݿ���
//�ι� ���� - db ��ҵ�
package ex22_4_5_PreparedStatement;

import java.sql.*;

public class JDBCExample7_Oracle_transaction {
	public static void main(String args[]) {
		// transaction : ������ �۾� ����
		// insert, delete, update ���� �۾����� �ϳ��� ������ �۾�������
		// ��� ���� ����� ��� �۾��� ���� ó�� �� ��쿡�� commit�� �����ؼ�
		// db�� �ݿ��ϰ� ���� ���� �� �ϳ��� ����ó�� ���� �ʴ� ���
		// rollback�� �����ؼ� �۾��������� ��� �۾��� ����Ѵ�.

		// SQL�� �ۼ��ϱ�
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into goodsinfo ");
		sql1.append("values(?,?,?,?) ");

		StringBuilder sql2 = new StringBuilder();
		sql2.append("update goodsinfo ");
		sql2.append("set price = ? ");
		sql2.append("where code = ? ");

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			///// transaction ���� /////
			// �ϳ��� ������ �۾� ���� ����
			// 1�ܰ� JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2�ܰ� : DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");

			// autoCommit ��� ��Ȱ��ȭ ��Ű��
			conn.setAutoCommit(false);

			// ----------1�� �۾� ����------------//
			// PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql1.toString());

			// ������ ?�� ��ü�� ������ �����ϱ�
			pstmt.setString(1, "10006");
			pstmt.setString(2, "����û����");
			pstmt.setInt(3, 500000);
			pstmt.setString(4, "�ڿ���");
			int result1 = pstmt.executeUpdate();
			pstmt.close();
			// --------1�� �۾� ����----------//

			// --------2�� �۾� ����----------//
			// PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql2.toString());

			// ������ ?�� ��ü�� ���� �� �����ϱ�
			pstmt.setInt(1, 12345);
			pstmt.setString(2, "10001");
			int result2 = pstmt.executeUpdate();
			// --------2�� �۾� ����----------//

			// ������ ���������� ����� ��� db�� �ݿ�
			if (result1 == 1 && result2 == 1) {
				conn.commit();
				System.out.println("db�� �ݿ��� . . .");
			} else {
				conn.rollback();
				System.out.println("db �ݿ��� ��� �� .....");
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			try {
				System.out.println(se.getMessage());
				conn.rollback();
				System.out.println("db �ݿ��� ��� ��....");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				// Note:When a Statement object is closed, its current ResultSet object,
				// if one exists, is also closed
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null)
					;
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/////transaction ���� /////

		}

	}
}
