package ex07_test_01_Student2;

public class Student2_static {
	public static void main(String args[]) {
		Student2 h1 = new Student2("��ȣ��", 85, 60, 70);
		Student2 h2 = new Student2("�̽±�", 90, 95, 80);
		Student2 h3 = new Student2("���缮", 75, 80, 100);
		Student2 h4 = new Student2("����", 80, 70, 95);
		Student2 h5 = new Student2("�̱���", 100, 65, 80);
		
		System.out.println("========== �л���  /  ���� ���� ���ϱ� ==========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		
		
		printInfo(h1);
		printInfo(h2);
		printInfo(h3);
		printInfo(h4);
		printInfo(h5);
		
		
		for(int j=0;j<45;j++) {
			System.out.print("=");
		}
		System.out.println("\n����\t" + Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
		
		
	}

		static void printInfo(Student2 h1) {
		System.out.print(h1.name+"\t"+h1.kor+"\t"+h1.eng+"\t"+h1.math+"\t"+h1.getTotal()+"\t");
		System.out.printf("%.1f\n", h1.getAverage());
		
	}



	
}
