//���̳ʽ� ���� Ŭ����
// - ��� ���� withdraw�޼��带 �ٽ� ����(�޼��� �������̵�) �ϴ� Ŭ����
//�޼��� �������̵�(����Ŭ������ ���ǵ� �޼��带 ���� Ŭ�������� ������ �ϴ� ��) ����
//1. ��� ����
//2. �θ� Ŭ������ ����ο� ��ġ(���ϰ� Ÿ��, �޼��� �̸�, �Ű����� ���)
//3. ���� �������� ������ ���ų� �о�� �Ѵ�.
package ex08_04_overriding;

public class CreditLineAccount extends Account {
	int creditLine;
	CreditLineAccount(String accountNo, String ownerName,
						int balance, int creditLine){
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	//�޼��� �������̵� - �����Ѵ� ��� �ٽ� ����
	// (�ܾ� + ���̳ʽ� �ѵ�) < ����� ��� "������ �Ұ����մϴ�." ���� �߻���ŵ�ϴ�.
	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("������ �Ұ����մϴ�");
		balance -= amount;
		return amount;
	}

}
