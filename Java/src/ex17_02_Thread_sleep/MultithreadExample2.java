//���ĺ��� ���ڸ� ����ϴ� ���α׷�
package ex17_02_Thread_sleep;

class MultithreadExample2 {
	public static void main(String args[]) {
		Thread thread = new DigitThread();
		thread.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
				//sleep �޼ҵ� : ���� �ð��� ����Ǳ⸦ ��ٸ��� �޼ҵ�.
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//main end

}//class end
