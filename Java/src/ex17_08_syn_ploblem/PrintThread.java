//계좌 잔액 합계를 출력하는 스레드 클래스
package ex17_08_syn_ploblem;
class PrintThread extends Thread{
	SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){ //생성자
		this.sharedArea = sharedArea;
	}
	
	public void run() {
		
		for(int cnt=0; cnt<3; cnt++) {
			int sum = sharedArea.getAccount1().getBalance() +
					  sharedArea.getAccount2().getBalance();
			System.out.println("계좌 잔액 합계: " + sum);
			try {
				Thread.sleep(1);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end			
	}//run end
}//class end
