package ex11_5_Calendar;

import java.util.Calendar;

public class Calendar2_3 {
	public static void main(String args[]) {
	String[] yo = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
	
	//Calendar ���� �ΰ���
	Calendar c1 = Calendar.getInstance();
	//Calendar c2 = new GregorianCalendar();//�� ĳ���� ���
	
	int y = c1.get(Calendar.YEAR);
	int m = c1.get(Calendar.MONTH)+1; //���� 0���� 11���� �������� 1�� ���ؾ� �Ѵ�.
	int d = c1.get(Calendar.DATE);
	//int h = c1.get(Calendar.HOUR_OF_DAY); //24�ð�
	int h1 = c1.get(Calendar.HOUR); //12�ð�
	int ap = c1.get(Calendar.AM_PM);//����:0, ����:1
	int mm = c1.get(Calendar.MINUTE);
	int s = c1.get(Calendar.SECOND);
	int yoil = c1.get(Calendar.DAY_OF_WEEK); //�Ͽ���:1,������:2,ȭ����:3...
	
	System.out.print(y+"�� "+m+"�� "+d+"�� ");
	
	System.out.print( ap == Calendar.AM ? " ���� " : " ���� ");
	
	System.out.print(h1+":"+mm+":"+s+"�� ");
	System.out.print(yo[yoil-1]+" �Դϴ�.");
	
	}
}