//�ڹٴ� �� Ÿ���� ���� ������ ���� Ÿ���� ��ü�� ������ �� �ֵ��� �ߴµ�
//���� Ŭ���� Ÿ���� ���� ������ �ڼ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� �Ͽ����ϴ�.
//==> ������
package ex08_12_polymorphism;
class inheritanceExample {
	public static void main(String args[]) {
		Account obj1 = new Account("111-22-333333", 
								"�Ӳ���", 10000);
		
		System.out.println("���¹�ȣ:"+ obj1.accountNo);
		System.out.println("�������̸�:" + obj1.ownerName);
		System.out.println("�ܾ�:"+obj1.balance);
		System.out.println();
		
		
		
		CheckingAccount obj2 = new CheckingAccount
				("444-55-666666", "ȫ�浿", 20000,
								 "5555-6666-7777-8888");
		
		System.out.println("���¹�ȣ:"+ obj2.accountNo);
		System.out.println("�������̸�:" + obj2.ownerName);
		System.out.println("�ܾ�:"+obj2.balance);
		System.out.println();
		
		
		CreditLineAccount obj3 = new CreditLineAccount(
				"777-88-999999", "�輱��", 30000, 20000000);
		
		System.out.println("���¹�ȣ:"+ obj3.accountNo);
		System.out.println("�������̸�:" + obj3.ownerName);
		System.out.println("�ܾ�:"+obj3.balance);
		System.out.println();
		
		
		BonusPointAccount obj4 = new BonusPointAccount(
				"000-00-000000", "��̿�", 0, 0);
		
		System.out.println("���¹�ȣ:"+ obj4.accountNo);
		System.out.println("�������̸�:" + obj4.ownerName);
		System.out.println("�ܾ�:"+obj4.balance);
		System.out.println();
	
	}

}
