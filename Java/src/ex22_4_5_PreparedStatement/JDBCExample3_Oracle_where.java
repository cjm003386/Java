package ex22_4_5_PreparedStatement;
import java.sql.*;
public class JDBCExample3_Oracle_where {
	public static void main(String args[]) {
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");
			String sel_where_sql
			= "select code, name, price, maker "
			+ "from  goodsinfo "
			+ "where  name = ?";
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());
			pstmt.setString(1, "디지털 TV");
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t상품코드\t상품명\t\t가격\t제조사");
			System.out.println("-------------------------------------------------");
			
			
			int i = 0;
			while(rs.next()) { //더 이상 읽을 데이터가 없을 때까지 반복
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n", i++, code, name, price, maker);
			}
			
		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
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
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
			}
			try {
				if (conn != null)
					conn.close(); //4단계 : DB연결을 끊는다.
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}//fianlly
	}

}
