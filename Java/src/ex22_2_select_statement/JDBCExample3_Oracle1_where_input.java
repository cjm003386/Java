//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
//arguments�ǿ� "������ TV"��� �Է��ϼ���
package ex22_2_select_statement;
import java.sql.*;
public class JDBCExample3_Oracle1_where_input {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("��ǰ�� �Է��ϼ���");
			
		}
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			stmt = conn.createStatement();
			
			String sel_where_sql
			= "select code, name, price, maker "
			+ "from  goodsinfo "
			+ "where  name = '" + args[0] + "'";
			
			System.out.println(sel_where_sql+"\n");
			rs = stmt.executeQuery(sel_where_sql);
			
			System.out.println("��ȣ\t��ǰ�ڵ�\t��ǰ��\t\t����\t������");
			System.out.println("-------------------------------------------------");
			
			
			int i = 0;
			while(rs.next()) { //�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n", i++, code, name, price, maker);
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
