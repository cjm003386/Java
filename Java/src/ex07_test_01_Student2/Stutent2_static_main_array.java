package ex07_test_01_Student2;

public class Stutent2_static_main_array {
	public static void main(String args[]) {
		Student2[] students = {     new Student2("강호동", 85, 60, 70),
                new Student2("이승기", 90, 95, 80),
                new Student2("유재석", 75, 80, 100),
                new Student2("하하", 80, 70, 95),
                new Student2("이광수", 100, 65, 80) };
		
		printStudent(students);
		
	}

	private static void printStudent(Student2[] objs) {
		System.out.println("==========  학생별  /  과목별 총점 구하기 ==========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for (Student2 obj : objs) {
			System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math+"\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
	}
		for(int j=0;j<45;j++) {
			System.out.print("=");
		}
		System.out.println("\n총점\t" + Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);

}
}
