//���� �ܾ� �հ踦 ����ϴ� ������ Ŭ����
package ex17_11_syn_format2;
class PrintThread extends Thread{
	SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){ //������
		this.sharedArea = sharedArea;
	}
	
	public void run() {
		
		for(int cnt=0; cnt<3; cnt++) {
		
		int sum =sharedArea.getTotal();
			
			System.out.println("���� �ܾ� �հ�: " + sum);
		
			try {
				Thread.sleep(1);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end			
	}//run end
}//class end
