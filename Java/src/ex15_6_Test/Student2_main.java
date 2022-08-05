package ex15_6_Test;

import java.util.ArrayList;


public class Student2_main {
	public static void main(String args[]) {
	Student2[] students = { 
			   new Student2("강호동", 85, 60, 70),
            new Student2("이승기", 90, 95, 80), 
            new Student2("유재석", 75, 80, 100), 
            new Student2("하하", 80, 70, 95), 
            new Student2("이광수", 100, 65, 80) };
	ArrayList<Student2> as = new ArrayList<Student2>();
	for(Student2 s : students) {
		as.add(s);
	}
	
	Student2.sort(as);
	print(as); //출력하기
	
	

}

	private static void print(ArrayList<Student2> as) {
		System.out.println("========= 학생별  /  과목별 총점 구하기 =========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		
	}
}
