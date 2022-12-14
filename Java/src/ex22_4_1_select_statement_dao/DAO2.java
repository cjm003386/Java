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
			// 1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계: DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "SCOTT", "TIGER");

			/*
			 * 데이터 베이스에 있는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요합니다. 2단계에서 얻은 Connection 객체에 대해
			 * createStatement 메소드를 호출해서 얻습니다.
			 */
			stmt = conn.createStatement();

			/*
			 * Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로 select문을 실행하는 executeQuery라는 메소드가
			 * 있습니다. 이 메소드에 파라미터로 select 문장을 넘겨주어야 합니다. 이 메소드는 파라미터로 넘겨준 select 문을 데이터 베이스로
			 * 보내서 실행하고 그 결과로 Resultset 객체를 리턴합니다.
			 */
			String select_sql = "select*from emp";
			rs = stmt.executeQuery(select_sql);

			System.out.println("번호\t사원번호\t사원이름\t직급\t\t상사\t입사일\t\t급여\t커미션\t부서번호");
			for (int i = 0; i < 100; i++) {
				System.out.print("-");
			}
			System.out.println();

			/*
			 * ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메소드를 호출해야 합니다. rs.next()-
			 * 다음 행 위치로 이동하는 메소드 리턴 값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			while (rs.next()) { // 더 이상 읽을 데이터가 없을 때까지 반복
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
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
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
					conn.close(); // 4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}//finally
		
		return list;
		//return null;
	}

}
