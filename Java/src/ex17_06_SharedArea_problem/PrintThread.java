//파이를 출력하는 스레드 클래스
package ex17_06_SharedArea_problem;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
		}
	
	public void run() {
		//공유 영역의 데이터를 출력
		System.out.println("공유 영역의 데이터 = " +sharedArea.getResult());
	}
	
	

}
