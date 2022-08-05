package ex07_test_01_Student2;



public class Student2_static_main_array_sort {
	public static void main(String agrs[]) {
	    Student2 h1 = new Student2("강호동", 85, 60, 70);
		Student2 h2 = new Student2("이승기", 90, 95, 80);
		Student2 h3 = new Student2("유재석", 75, 80, 100);
		Student2 h4 = new Student2("하하", 80, 70, 95);
		Student2 h5 = new Student2("이광수", 100, 65, 80);
		Student2[] students = {h1, h2, h3, h4, h5};
		
		sort(students);
		printInfo(students);
		
	}//main

	
	
	// 학생별 총점을 기준으로 정렬하기
	static void sort(Student2[] students) {
		Student2 imsi;
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getTotal() < students[j].getTotal()) {
					imsi = students[i];
					students[i] = students[j];
					students[j] = imsi;
				}
			}
		}

	}
 



static void printInfo(Student2[] objs) {
	int[] total = new int[3];
	
	System.out.println("==========  학생별  /  과목별 총점 구하기 ==========");
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	
	for (Student2 obj : objs) {
		System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math+"\t" + obj.getTotal() + "\t");
		System.out.printf("%.1f\n", obj.getAverage());
		
		total[0] += obj.kor;
		total[1] += obj.eng;
		total[2] += obj.math;
	}
	
	for (int j = 0; j < 45; j ++) {
		System.out.print("=");
	}
	
	System.out.println("\n총점\t" + Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
}

}


