//���� ���� Ŭ����
package ex17_13_notifyall_wait;

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
		
		//���� �����Ͱ� ���������� ���θ� ǥ���ϴ� �ʵ�-����Ʈ(false)
		private boolean isReady;
		
		public boolean isReady() {
			return isReady;
		}
		
		public void setReady(boolean isReady) {
			this.isReady = isReady;
		}
	

}
