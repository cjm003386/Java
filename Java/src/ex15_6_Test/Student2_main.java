package ex15_6_Test;

import java.util.ArrayList;


public class Student2_main {
	public static void main(String args[]) {
	Student2[] students = { 
			   new Student2("��ȣ��", 85, 60, 70),
            new Student2("�̽±�", 90, 95, 80), 
            new Student2("���缮", 75, 80, 100), 
            new Student2("����", 80, 70, 95), 
            new Student2("�̱���", 100, 65, 80) };
	ArrayList<Student2> as = new ArrayList<Student2>();
	for(Student2 s : students) {
		as.add(s);
	}
	
	Student2.sort(as);
	print(as); //����ϱ�
	
	

}

	private static void print(ArrayList<Student2> as) {
		System.out.println("========= �л���  /  ���� ���� ���ϱ� =========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
	}
}
