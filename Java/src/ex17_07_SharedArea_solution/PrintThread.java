//���̸� ����ϴ� ������ Ŭ����
package ex17_07_SharedArea_solution;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
		}
	
	public void run() {
		//SharedArea��ü�� isReady �ʵ� ���� true�ɶ� ���� �ݺ��Ѵ�.
		while (sharedArea.isReady() !=true) {
			System.out.println("������ ~");
		}
		
		
		//���� ������ �����͸� ���
		System.out.println("���� ������ ������ = " +sharedArea.getResult());
	
	}//run end
	
}//class end
