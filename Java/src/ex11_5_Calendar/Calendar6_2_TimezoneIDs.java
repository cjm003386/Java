//런던의 현재 날짜와 시간을 출력하는 프로그램
package ex11_5_Calendar;

import java.util.*;

public class Calendar6_2_TimezoneIDs {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		calendar.setTimeZone(timeZone);
		
		System.out.println("런던의 현재 시간입니다.");
		Today t = new Today(calendar);
		System.out.println(t);
		
	}

}
