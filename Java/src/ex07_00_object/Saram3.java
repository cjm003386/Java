package ex07_00_object;

public class Saram3 {
	String name;
	double w;
	double ki;
	int age;

	//������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
    Saram3(String name2){		
		name=name2;
	}	
	
	public void eat() {
		System.out.println(name + "��(��) ���� �Դ´�.");
	}

	public void walk() {
		System.out.println(name + "��(��) �ȴ´�.");
	}

	public void sesu() {
		System.out.println(name + "��(��) �����Ѵ�.");
	}

}
