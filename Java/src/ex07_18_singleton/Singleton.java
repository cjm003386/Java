//�̱���(Singleton)
package ex07_18_singleton;

public class Singleton {
	//�ʵ� s �� �ܺο��� ��� ���մϴ�.
	//�� ������ ó�� Singleton Ŭ������ JVM�� �ε��� �� �� ���� ����˴ϴ�.
	public static Singleton s = new Singleton();
	
	//Private : �ܺο��� �����ڸ� ȣ���� �� ������ �����ϴ�.
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		System.out.println("����� getInstance�Դϴ�");
		return s;
	}

}
