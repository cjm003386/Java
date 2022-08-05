package ex08_02_constructor;

public class InheritanceExample {
	public static void main(String args[]) {
		
		CheckingAccount obj_error = new CheckingAccount();
		
		obj.deposit(1000000); // 상속받은 메서드
		
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액" + paidAmount);
			System.out.println("잔액:" + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}

}
