//공유 영역 클래스
package ex17_07_SharedArea_solution;

public class SharedArea {
	private double result;
	
	SharedArea(){
	}
	
	
	public double getResult(){
		return result;
	}
	
	public void setResult(double result) {
		this.result=result;
		
	}
	//공유 데이터가 쓰여졌는지 여부를 표현하는 필드-디폴트(False)
	private boolean isReady;
	
	public boolean isReady() {
		return isReady;
	}
	
	public void setReady(boolean isReady) {
		this.isReady=isReady;
	}

}
