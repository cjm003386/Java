//Runnable�������̽��� �̿��� ��Ƽ������ ���α׷�
package ex17_04_Runnable_Interface_anonymous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultithreadExample2 {
	public static void main(String args[]) {
		Thread t = new Thread(){
			
			public void run() {
				SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd�� E���� HH��mm��ss��");
				for(;;) {
					Date d = new Date(); //���� �ý��� ���ڿ� �ð�
					System.out.println(s.format(d));
					try {
						Thread.sleep(1000);
					}catch (InterruptedException ie) {
						System.out.println(ie.toString());
					}
				}
			}
		};
		t.start();
	}
}
			
	


