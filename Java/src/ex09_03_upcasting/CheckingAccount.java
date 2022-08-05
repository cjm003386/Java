
package ex09_03_upcasting;

public class CheckingAccount extends Account{
	String cardNo;
	
	
	CheckingAccount (String accountNo, String ownerName,
					int balance, String cardNo) {
		super();
		this.accountNo = accountNo; 	// 상속 받은 필드 초기화
		this.ownerName = ownerName; 	// 상속 받은 필드 초기화
		this.balance = balance;  		// 상속 받은 필드 초기화
		this.cardNo = cardNo;  			// 클래스 안에 선언된 필드 초기화
		
}	
		int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);

}
}