package ex08_04_overriding;

public class InheritanceExample {
	public static void main(String args[]) {
		CreditLineAccount obj =
			new CreditLineAccount("000-11-111111", "�輱��", 100, 20000);
	try {
		int amount = obj.withdraw(500);
		//int amount = obj.withdraw(50000);
		System.out.println("�����:" + amount);
		System.out.println("�ܾ�:" + obj.balance);
		System.out.println("���̳ʽ� �ѵ�:" + obj.creditLine);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
