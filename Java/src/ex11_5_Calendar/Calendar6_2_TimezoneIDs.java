//������ ���� ��¥�� �ð��� ����ϴ� ���α׷�
package ex11_5_Calendar;

import java.util.*;

public class Calendar6_2_TimezoneIDs {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		calendar.setTimeZone(timeZone);
		
		System.out.println("������ ���� �ð��Դϴ�.");
		Today t = new Today(calendar);
		System.out.println(t);
		
	}

}
