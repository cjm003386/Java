//���� ���� Ŭ����
package ex17_08_syn_ploblem;

class Account {
	private String accountNo;  //���¹�ȣ
	private String ownerName;  //������ �̸�
	private int balance;       //�ܾ�

	//Ŭ�����ȿ��� ���콺 ��Ŭ�� -> Source - > Generage Getters and Setters�� ���� �� �ֽ��ϴ�.
	
	Account(String accountNo, String ownerName, int balance) {//������
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if (balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
	
	
	

}



