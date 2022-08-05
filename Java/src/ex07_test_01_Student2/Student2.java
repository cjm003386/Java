package ex07_test_01_Student2;

public class Student2 {
	
	String name; //이름
	int kor, eng, math; //국어 영어 수학
	
	static int korTotal, mathTotal, engTotal = 0; //국어 총합, 수학 총합, 영어 총합
	
	
	Student2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal += kor;
		mathTotal += math;
		engTotal += eng;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return getTotal() / (float)3;
	}
	
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
	

}

