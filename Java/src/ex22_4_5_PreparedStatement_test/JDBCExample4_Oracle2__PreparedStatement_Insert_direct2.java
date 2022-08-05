package ex22_4_5_PreparedStatement_test;

import java.sql.*;

public class JDBCExample4_Oracle2__PreparedStatement_Insert_direct2 {
	public static void main(String args[]) {
		// "A5000" "��� �ڵ���" 100 "LG"
		if (args.length !=4) {
			System.out.println( "��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
			return;
		}
		Connection conn =null;
		PreparedStatement pstmt = null;
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
					   + "values(?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			int rowNum = pstmt.executeUpdate();
			
			
//			System.out.println(sql);
			
			System.out.println(rowNum + "���� �߰��Ǿ����ϴ�.");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
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

