package ex08_03_super_constructor;

public class InheritanceExample2 {
	public static void main(String args[]) {
		
	CheckingAccount2 obj =
			new CheckingAccount2("111-22-33333333",
					"ȫ�浿",0,"5555-6666-7777-8888");
	//super(); ����
	obj.deposit(100000); 
	try{
		int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
		System.out.println("���Ҿ�" + paidAmount);
		System.out.println("�ܾ�:" + obj.balance);
	}catch(Exception e){
		String msg = e.getMessage();
		System.out.println(msg);

	}
}
}


