//���̸� ����ϴ� ������ Ŭ����
package ex17_07_SharedArea_solution;

public class CalcThread extends Thread {
	private SharedArea sharedArea;

	CalcThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		double total = 0.0;
		// ���̸� ����ϴ� �κ�
		for (int cnt = 1; cnt < 1000000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;

		// ��� ����� ���� ������ ����
		sharedArea.setResult(total * 4);
		
		//SharedArea ��ü�� isReady �ʵ� ���� true�� ����
		sharedArea.setReady(true);
	}

}


