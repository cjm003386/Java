package ex07_test_01_Student2;

public class Student2_static {
	public static void main(String args[]) {
		Student2 h1 = new Student2("강호동", 85, 60, 70);
		Student2 h2 = new Student2("이승기", 90, 95, 80);
		Student2 h3 = new Student2("유재석", 75, 80, 100);
		Student2 h4 = new Student2("하하", 80, 70, 95);
		Student2 h5 = new Student2("이광수", 100, 65, 80);
		
		System.out.println("========== 학생별  /  과목별 총점 구하기 ==========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		
		
		printInfo(h1);
		printInfo(h2);
		printInfo(h3);
		printInfo(h4);
		printInfo(h5);
		
		
		for(int j=0;j<45;j++) {
			System.out.print("=");
		}
		System.out.println("\n총점\t" + Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
		
		
	}

		static void printInfo(Student2 h1) {
		System.out.print(h1.name+"\t"+h1.kor+"\t"+h1.eng+"\t"+h1.math+"\t"+h1.getTotal()+"\t");
		System.out.printf("%.1f\n", h1.getAverage());
		
	}



	
}
