package ex08_02_constructor;

public class InheritanceExample {
	public static void main(String args[]) {
		
		CheckingAccount obj_error = new CheckingAccount();
		
		obj.deposit(1000000); // ��ӹ��� �޼���
		
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
