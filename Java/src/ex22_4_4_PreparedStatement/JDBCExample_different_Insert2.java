/*PreparedStatement
 * 
 * 1. PreparedStatement�� �θ�� Statement �Դϴ�.
 * 
 * 2. SQL ������ ������ ���ؼ��� �������� �ʿ��ѵ� PreparedStatement�� ������ �������� �մϴ�.
 * ��)pstmt = conn.prepareStatement(sql);
 * 
 * 3. PreparedStatement�� SQL������ �̸� ������ �Ǳ� ������ ���ǹ��� �ٲ��� �ʰ�
 * ���ǰ��� �ٲ�� ���, ������ �����͸� �ٲ�� ��� � ����ϸ� �����ϴ�.
 * ��, �� �� �̸� �������� �صθ� ���� ������ ���ؼ� �������� ���� �ʰ� ���� �����ؼ� �����մϴ�.
 * Statement�� ���� ������� �ص� �Ź� ������ ������ ��Ĩ�ϴ�.
 * ���� ���� ������ �����ϴ��� PreparedStatement�� Statement���� ����ӵ��� �����ϴ�.
 * 		��) insert into test(no, ename) values(1, 'ȫ�浿');
 * 			insert into test(no, ename) values(2, 'ȫ�浿');
 * 			insert into test(no, ename) values(3, 'ȫ�浿');
 * 
 * 4. 3���� �����ϱ� ���ؼ� ������ ������ ���� �����մϴ�.
 * �ٲ�� ���� ���ؼ� ?(��ġȦ��-placeholder, �Է¸Ű�����)�� ǥ���մϴ�.
 * ��) insert into test(no, ename) values(?,?);
 * 
 * 5. ?�� ���� ���� �����ϱ� ���� set�ڷ���()�޼��带 ����մϴ�.
 * ��) ù���� ?�� ���ǰ��� ������ 1�� ��� setInt(1,1)
 * ��) �ι��� ?�� ���ǰ��� ������ 'ȫ�浿'�� ��� setString(2, "ȫ�浿")
 * 	Statement�� SQL���忡�� single quotation(')�� �ʿ��� ��� ���� �ۼ��� �־�����
 * */
package ex22_4_4_PreparedStatement;

import java.sql.*;

public class JDBCExample_different_Insert2 {
	public static void main(String args[]) {
		Connection conn = null;
		//create table test( no number(10), name varchar2(20) )
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT","TIGER");
			
			int result = 0, count = 0;
			long start = System.currentTimeMillis();
			stmt = conn.createStatement();
			for (int i = 0; i < 10000; i++) {
				String sql = "insert into test(no, name) "
							+ "values(" + i + ",'ȫ�浿')";
				result = stmt.executeUpdate(sql);
				count += result;
				
			}
			long end = System.currentTimeMillis();
			
			System.out.println("�ҿ�ð�:" + (end - start) + "ms"); //1796 ms
			if (count == 10000)
				System.out.println("���� �Ϸ�");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if (stmt != null)
					stmt.close();
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); //4�ܰ� : DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
	

}
