//���� ���� Ŭ����
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
	//���� �����Ͱ� ���������� ���θ� ǥ���ϴ� �ʵ�-����Ʈ(False)
	private boolean isReady;
	
	public boolean isReady() {
		return isReady;
	}
	
	public void setReady(boolean isReady) {
		this.isReady=isReady;
	}

}
