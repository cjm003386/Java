
package ex09_03_upcasting;

public class CheckingAccount extends Account{
	String cardNo;
	
	
	CheckingAccount (String accountNo, String ownerName,
					int balance, String cardNo) {
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