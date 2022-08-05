//Runnable인터페이스를 이용한 멀티스레드 프로그램
package ex17_04_Runnable_Interface_anonymous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultithreadExample2 {
	public static void main(String args[]) {
		Thread t = new Thread(){
			
			public void run() {
				SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시mm분ss초");
				for(;;) {
					Date d = new Date(); //오늘 시스템 날자와 시간
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
			
	


