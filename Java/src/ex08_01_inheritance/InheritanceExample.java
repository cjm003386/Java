//obj.deposit(10);  //������ �Ұ����մϴ�.
package ex08_01_inheritance;

public class InheritanceExample {
	public static void main(String args[]) {
		CheckingAccount obj = new CheckingAccount();
		obj.accountNo = "111-22-33333333"; // ��ӹ��� �ʵ�
		obj.ownerName = "ȫ�浿"; // ��ӹ��� �ʵ�
		obj.cardNo = "5555-6666-7777-8888";
		//obj.deposit(1000000); // ��ӹ��� �޼���
		obj.deposit(10); //��� ���� �޼���
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
				System.out.println("���Ҿ�" + paidAmount);
				System.out.println("�ܾ�:" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}
