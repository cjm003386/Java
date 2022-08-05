package ex14_1_toString_test;

public class Main {
	public static void main(String args[]) {

		Student[] students = { 
				   new Student("��ȣ��", 85, 60, 70),
	               new Student("�̽±�", 90, 95, 80), 
	               new Student("���缮", 75, 80, 100), 
	               new Student("����", 80, 70, 95), 
	               new Student("�̱���", 100, 65, 80) };
		
		printStudent(students);
		
	}

	static void printStudent(Student[] objs) {
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (Student obj : objs) {
			System.out.println(obj.toString());
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n����\t");
		System.out.println(Student.korTotal+"\t"
		                  +Student.engTotal+"\t"
				          +Student.mathTotal);		
	}
}