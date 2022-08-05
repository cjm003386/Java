//포인트 적립 계좌 클래스
package ex08_05_Super_method;

public class BonusPointAccount extends Account {
	int bonusPoint;

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {

		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
//메서드 오버라이딩
	void deposit(int amount) {
		// balance += amount;    //super.deposit += amount;
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}

}
