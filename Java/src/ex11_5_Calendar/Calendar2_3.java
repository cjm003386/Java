package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar2_3 {
	public static void main(String args[]) {
	String[] yo = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
	
	//Calendar 사용법 두가지
	Calendar c1 = Calendar.getInstance();
	//Calendar c2 = new GregorianCalendar();//업 캐스팅 방법
	
	int y = c1.get(Calendar.YEAR);
	int m = c1.get(Calendar.MONTH)+1; //월이 0부터 11까지 구해져서 1을 더해야 한다.
	int d = c1.get(Calendar.DATE);
	//int h = c1.get(Calendar.HOUR_OF_DAY); //24시간
	int h1 = c1.get(Calendar.HOUR); //12시간
	int ap = c1.get(Calendar.AM_PM);//오전:0, 오후:1
	int mm = c1.get(Calendar.MINUTE);
	int s = c1.get(Calendar.SECOND);
	int yoil = c1.get(Calendar.DAY_OF_WEEK); //일요일:1,월요일:2,화요일:3...
	
	System.out.print(y+"년 "+m+"월 "+d+"일 ");
	
	System.out.print( ap == Calendar.AM ? " 오전 " : " 오후 ");
	
	System.out.print(h1+":"+mm+":"+s+"초 ");
	System.out.print(yo[yoil-1]+" 입니다.");
	
	}
}