//���̸� ����ϴ� ������ Ŭ����
package ex17_13_notifyall_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	PrintThread(SharedArea sharedArea){
		this.sharedArea=sharedArea;
	}
	

	
	public void run() {
		if(sharedArea.isReady() != true) { //���̰� ��� ���� ���
			/* ������ ���- ���� ����� ���� �� ���� ��� üũ�ؾ� �߽��ϴ�.
			 * while (sharedArea.isReady != true){
			 * 		System.out.println("������ ~);
			 * }
			 */
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//�ٸ� ������� ���� ��ȣ�� ��ٸ��ϴ�.
						//������ ����� ������ �ٸ� �����忡�� ��ȣ�� �����ϴ�.
					}
			}//try end
			catch(InterruptedException e) { //wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
				System.out.println(e.getMessage());
			}//catch end
		}//if end
		System.out.println(sharedArea.getResult());
	}
	
	
}
