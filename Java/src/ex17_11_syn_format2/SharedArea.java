//���� ���� Ŭ����
package ex17_11_syn_format2;

public class SharedArea {
	private Account account1; // �̸����� ����
	private Account account2; // �������� ����
	
	SharedArea(Account account1, Account account2){
		this.account1 = account1;
		this.account2 = account2;
		}
	//Ŭ�����ȿ��� ���콺 ��Ŭ�� -> Source
	//-> Generate Getters and Setters�� ���� �� �ֽ��ϴ�.
	
	
	//����ȭ �޼ҵ�
		synchronized void transfer() { 
			account1.withdraw(1000000);
			account2.deposit(1000000);
		} 
	
	//����ȭ �޼ҵ�
	synchronized int getTotal() { // �ܾ� �հ踦 ���Ѵ�.
		synchronized (this) {
			return account1.getBalance() + account2.getBalance();
		} 
	}

	
	
	

}
