//���� ��ü�� �ܾ� �հ� ����� ���ÿ� �ϴ� ��Ƽ������ ���α׷�

//�̸����� ���¿��� ����� 100������ �������� ���·� �ԱݵǱ� ����
//printThread�� ���� ��� �Ѿ ���� �ܾ� �հ� 29000000 ��µǾ����ϴ�.
//-���� �ذ��
//	����ȭ:���� ������ ��� �߿� �� ���� �����͸� �ٸ� �����尡 ������� ���ϵ��� ����� ���� �ǹ��մϴ�.

package ex17_08_syn_ploblem;

public class MultithreadExample {
	public static void main(String argsp[]) {
	Account a1 = new Account("111-111-1111", "�̸���", 20000000);
	Account a2 = new Account("222-222-2222", "������", 10000000);
	SharedArea area = new SharedArea(a1, a2);
	TransferThread thread1 = new TransferThread(area);
	PrintThread thread2 = new PrintThread(area);
	thread1.start();
	thread2.start();

}
}