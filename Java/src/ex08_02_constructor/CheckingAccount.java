//�����ڰ� �߰��� ���� ���� Ŭ����
package ex08_02_constructor;

public class CheckingAccount extends Account{
	String cardNo;
	
	//�������� ù �ٿ��� ���� Ŭ������ �����ڸ� ȣ���ϴµ� �ڼ� Ŭ������ �����
	//�θ� Ŭ������ ����� ����� �� �����Ƿ� �θ��� ������� ���� �ʱ�ȭ�Ǿ� �־�� �մϴ�.
	
	CheckingAccount (String accountNo, String ownerName,
					int balance, String cardNo) {
	//������ ù �ٿ��� �θ� �����ڸ� ȣ������ �ʾұ� ������ �����Ϸ��� �θ��� �����ڸ�
		//ȣ���ϴ� ������ super();�� ���⿡ �����մϴ�.
		super();
		this.accountNo = accountNo; 	// ��� ���� �ʵ� �ʱ�ȭ
		this.ownerName = ownerName; 	// ��� ���� �ʵ� �ʱ�ȭ
		this.balance = balance;  		// ��� ���� �ʵ� �ʱ�ȭ
		this.cardNo = cardNo;  			// Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
		
}	
		int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);

}
}