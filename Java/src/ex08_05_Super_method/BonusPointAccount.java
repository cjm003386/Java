//����Ʈ ���� ���� Ŭ����
package ex08_05_Super_method;

public class BonusPointAccount extends Account {
	int bonusPoint;

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {

		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
//�޼��� �������̵�
	void deposit(int amount) {
		// balance += amount;    //super.deposit += amount;
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}

}
