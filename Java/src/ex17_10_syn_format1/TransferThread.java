//���� ��ü�� �����ϴ� ������ Ŭ����
package ex17_10_syn_format1;

class TransferThread extends Thread{
	private SharedArea sharedArea;
	
	TransferThread(SharedArea area){
		sharedArea = area;
		}
	
		public void run() {
			for (int cnt = 0; cnt < 12; cnt++) {
				sharedArea.transfer();
			}
		}
	}
