package ex22_4_1_select_statement_dao;

import java.util.*;

//emp의 모든 정보를 조회하는 클래스를 통해 가져온 데이터를 출력합니다.
public class CRUD2_Map {
	// CRUD : 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	// C(Create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자", "급여", "커미션", "부서번호", "종료" };

	public static void main(String[] args) {
		seLectAll();
	}

	private static void seLectAll() {
		DAO2 dao2 = new DAO2();
		ArrayList<Map<String, Object>> m =dao2.selectAll();
		
		if (m==null) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0],menus[1],menus[2],menus[3],
			menus[4],menus[5],menus[6],menus[7]);
			for (Map<String, Object> s:m) {
				System.out.printf("%-8s%-8s%-16s%s\t%-16s%s\t%s\t%s\n",
						s.get("Empno"),s.get("Ename"),s.get("Job"),s.get("Mgr"),s.get("Hiredate")
						, s.get("Sal"),s.get("Comm"),s.get("Deptno"));
			}
		}
	}
}
