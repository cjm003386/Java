package ex09_05_downcasting;

public class CheckingAccount extends Account{
	String cardNo;
	
	
	CheckingAccount (String accountNo, String ownerName,
					int balance, String cardNo) {
		super(accountNo, ownerName, balance);
			this.cardNo = cardNo;  			// Ŭ���� �ȿ� ����� �ʵ� �ʱ�ȭ
		
}	
		int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);

}
}