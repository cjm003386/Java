package ex11_5_Calendar;

import java.util.GregorianCalendar;

public class Calender3_3_set {
	public static void main(String[] args) {
		
		//���� ��¥�� �ð����� ����
		GregorianCalendar g = new GregorianCalendar();
		
		//Ư�� ��¥�� ����
		g.set(2022, 4, 2); //2022. 5. 2
		Today t3 = new Today(g);
		System.out.println(t3.toString());
		
		//�����ڿ��� �⵵, ��, �� ����
		Today t1 = new Today(new GregorianCalendar(2021, 10, 30));
		System.out.println(t1.toString());
		
		//�����ڿ��� �⵵, ��, ��, �� ,�� ,�� ����
		Today t2 = new Today(new GregorianCalendar(2021, 7, 2, 10, 10, 10));
		System.out.println(t2.toString());
	}
}
