package ex08_03_super_constructor;

public class CheckingAccount2 extends Account {
	String cardNo;

	CheckingAccount2 (String accountNo, String ownerName,
			int balance, String cardNo){
	
	super(accountNo, ownerName, balance);
//	this.accountNo = accountNo; 	
//	this.ownerName = ownerName; 	
//	this.balance = balance;  		
	this.cardNo = cardNo;  			
	
}	
	int pay(String cardNo, int amount) throws Exception {
	if (!cardNo.equals(this.cardNo) || (balance < amount))
		throw new Exception("������ �Ұ����մϴ�.");
	return withdraw(amount);

	}
}
