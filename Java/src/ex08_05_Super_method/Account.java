//���� ���� Ŭ����
package ex08_05_Super_method;

public class Account {
	String accountNo;  //���¹�ȣ
	String ownerName;  //������ �̸�
	int balance;       //�ܾ�
	
	Account(String accountNo, String ownerName, int balance) {//������
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
		void deposit (int amount) {  //�����Ѵ�.
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {  //�����Ѵ�.
		if (balance < amount)
			throw new Exception("�ܾ��� �����մϴ�.");
		balance -= amount;
		return amount;
	}

}




