//���̸� �Ҽ��� ���ڸ����� ����ϴ� Ŭ����
package ex17_13_notifyall_wait;

public class SimplePrintThread extends Thread{
	private SharedArea sharedArea;
	SimplePrintThread(SharedArea sharedArea){
		this.sharedArea=sharedArea;
	}
	
	public void run() {
		if (sharedArea.isReady() != true) {
			synchronized (sharedArea) {
				try {
				sharedArea.wait();// �ٸ� ������� ���� ��ȣ�� ��ٸ��ϴ�.
				} // try end
				catch (InterruptedException e) { // wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
					System.out.println(e.getMessage());
				} // catch end
			} // if end
			System.out.printf("SimplePrintThread : %.2f%n", sharedArea.getResult());
		} // run end

	}
}