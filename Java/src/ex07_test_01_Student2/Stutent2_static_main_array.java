package ex07_test_01_Student2;

public class Stutent2_static_main_array {
	public static void main(String args[]) {
		Student2[] students = {     new Student2("��ȣ��", 85, 60, 70),
                new Student2("�̽±�", 90, 95, 80),
                new Student2("���缮", 75, 80, 100),
                new Student2("����", 80, 70, 95),
                new Student2("�̱���", 100, 65, 80) };
		
		printStudent(students);
		
	}

	private static void printStudent(Student2[] objs) {
		System.out.println("==========  �л���  /  ���� ���� ���ϱ� ==========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		for (Student2 obj : objs) {
			System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math+"\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
	}
		for(int j=0;j<45;j++) {
			System.out.print("=");
		}
		System.out.println("\n����\t" + Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);

}
}
