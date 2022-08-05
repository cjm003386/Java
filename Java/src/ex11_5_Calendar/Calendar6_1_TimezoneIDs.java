package ex11_5_Calendar;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar6_1_TimezoneIDs {
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("���� Ÿ�� zone =" + cal.getTimeZone().getID());
		
		System.out.println("=================");
		for (String name : TimeZone.getAvailableIDs())
			System.out.println(name);
	}

}
