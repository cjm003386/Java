package ex17_01_Thread;

//���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ������ ���α׷�
//JVM�� �����忡 �Ҵ��ϴ� �ð��� ���� ������ �ϵ������ �����̳� �ý��� ȯ�濡
//���� �޶� ���� ����� �Ź� �ٸ� ����� ���� �� �ֽ��ϴ�.

public class MultithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new  DigitThread(); //�����带 ����
		
		// thread�� �����ŵ�ϴ�.
		thread.start();
		/*
		 * -start() ����:
		 * Causes this thread to begin execution;
		 * the java Virtual Machine calls the run method of this thread.
		 * 
		 * this thread(Thread thread = new DigitThread()�� thread)�� ������ �����ϵ��� �մϴ�.
		 * Java ���� �ӽ��� �������� run() �޼ҵ带 ȣ���մϴ�.
		 * 
		 * -start()�� ���ؼ� run() ���� �մϴ�.
		 * start method�� java.lang.Thread Ŭ������ �޼ҵ��Դϴ�.
		 * ���� ������ Thread�� start�ϸ� Runnable ���°� �˴ϴ�.
		 * -thread.run(); �̷��� ȣ�� ���� �ʽ��ϴ�.
		 * */
		
		
		for(char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
			
			System.out.println("������ �̸� : " + Thread.currentThread().getName());
	

}
}
