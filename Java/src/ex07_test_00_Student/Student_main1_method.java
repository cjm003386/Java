package ex07_test_00_Student;

public class Student_main1_method {
	public static void main(String args[]) {
	
	
	Student h1 = new Student("��ȣ��", 85, 60, 70);
	Student h2 = new Student("�̽±�", 90, 95, 80);
	Student h3 = new Student("���缮", 75, 80, 100);
	Student h4 = new Student("����", 80, 70, 95);
	Student h5 = new Student("�̱���", 100, 65, 80);
	
	int total[] = new int[3];
	System.out.println("========== �л���  /  ���� ���� ���ϱ� ==========");
	System.out.println("�̸�\t����\t����\t����\t����\t���");
	
	printInfo(h1);
	printInfo(h2);
	printInfo(h3);
	printInfo(h4);
	printInfo(h5);
	
	total[0]=h1.kor+h2.kor+h3.kor+h4.kor+h5.kor;
	total[1]=h1.eng+h2.eng+h3.eng+h4.eng+h5.eng;
	total[2]=h1.math+h2.math+h3.math+h4.math+h5.math;
	
	for(int j=0;j<45;j++) {
		System.out.print("=");
	}
	
	System.out.print("\n����\t");
	for(int i=0;i<total.length;i++)
		System.out.print(total[i]+"\t");
	}

	private static void printInfo(Student h1) {
		System.out.print(h1.name+"\t"+h1.kor+"\t"+h1.eng+"\t"+h1.math+"\t"+h1.getTotal()+"\t");
		System.out.printf("%.1f\n", h1.getAverage());
		
	}

}
