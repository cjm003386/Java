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

					sharedArea.wait();// 다른 스레드로 부터 신호를 기다립니다.
					// 파이의 계산이 끝나면 다른 스레드에서 신호를 보냅니다.

				} // try end
				catch (InterruptedException e) { // wait 메소드가 발생하는 익셉션 처리
					System.out.println(e.getMessage());
				} // catch end
			} // if end
			System.out.println("*** π = " + sharedArea.getResult() + " ***");
		} // run end

	}// class end
}
