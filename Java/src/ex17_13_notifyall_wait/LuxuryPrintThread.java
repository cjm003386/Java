package ex17_13_notifyall_wait;

public class LuxuryPrintThread extends Thread {
	private SharedArea sharedArea;
	LuxuryPrintThread(SharedArea sharedArea){
		this.sharedArea=sharedArea;
	}
	
	
	public void run() {
		if (sharedArea.isReady() != true) {
			synchronized (sharedArea) {
				try {

					sharedArea.wait();// �ٸ� ������� ���� ��ȣ�� ��ٸ��ϴ�.
					// ������ ����� ������ �ٸ� �����忡�� ��ȣ�� �����ϴ�.

				} // try end
				catch (InterruptedException e) { // wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
					System.out.println(e.getMessage());
				} // catch end
			} // if end
			System.out.println("*** �� = " + sharedArea.getResult() + " ***");
		} // run end

	}// class end
}
