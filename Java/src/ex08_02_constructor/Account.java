//���� ���� Ŭ����
package ex08_02_constructor;

public class Account {
	String accountNo;  //���¹�ȣ
	String ownerName;  //������ �̸�
	int balance;       //�ܾ�
	
	// �⺻ �����ڸ� �����Ϸ��� �ڵ� �߰��մϴ�.
	// Account(){}
	
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


