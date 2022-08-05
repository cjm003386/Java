package ex07_test_00_Student;

public class Student {
	String name; //이름
	int kor, eng, math; //국어,영어,수학

	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
	int getTotal() {
		return kor + eng + math;
		}
	float getAverage() {
		return (getTotal() / 3f);
	}
}
