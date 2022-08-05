//Thread를 이용한 예

package ex17_02_Thread_sleep_Test;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ThreadSleep_date extends Thread {
	
	@Override
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

}
