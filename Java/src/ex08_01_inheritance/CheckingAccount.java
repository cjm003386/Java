package ex08_01_inheritance;

// ���� ���� Ŭ������ ��ӹ޴� ���� ���� Ŭ����
// ���� ���� Ŭ����(Account)  -���� Ŭ���� (����� ���ִ� Ŭ����)
// ���� ���� Ŭ����(CheckingAccount) - ����Ŭ���� (����� �޴� Ŭ����)

public class CheckingAccount extends Account {
	String cardNo; // ����ī�� ��ȣ

	CheckingAccount() {

	}
	/*
	 * �޼��� �̸� : pay
	 * �Ű����� : ī���ȣ(cardNo-���ڿ�), �����(amount-������)
	 * ��ȯ�� : int
	 * ��ȯ�Ǵ� �� : �θ� Ŭ������ ����޼��� ȣ��
	 * 
	 * balance �ʵ�� withdraw() �޼���� Account Ŭ������ ���� ��� �޾� ��� �����մϴ�.
	 * �� Ŭ���� �ȿ� ����Ǿ� �ִ� ��ó�� ����ϰ� �ֽ��ϴ�.
	 * */

	//���� ī�� ������ �����Ѵٿ� �ش��ϴ� �޼���
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
		    //super.withdraw (�θ�Ŭ���� ����)
	}

}


