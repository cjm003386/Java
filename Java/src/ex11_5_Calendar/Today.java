package ex11_5_Calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Today {
	//�ʵ�
	private Calendar c1 = new GregorianCalendar();
	
	public Today(GregorianCalendar c1) {
		this.c1=c1;
		}
	public Today() {} //������

	public String toString() {
		String[] yo = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		String[] ampm = {"����", "����"};
				
		int y = c1.get(Calendar.YEAR);

		int m = c1.get(Calendar.MONTH) + 1; // ���� 0���� 11���� �������� 1�� ���ؾ� �Ѵ�.
		int d = c1.get(Calendar.DATE);
		// int h = c1.get(Calendar.HOUR_OF_DAY); //24�ð�
		int h1 = c1.get(Calendar.HOUR); // 12�ð�
		int ap = c1.get(Calendar.AM_PM);// ����:0, ����:1
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK); // �Ͽ���:1,������:2,ȭ����:3...

		return y + "�� " + m + "�� " + d + "�� " + ampm[ap] + " " + h1 + ":" + mm + ":" + s + " " + yo[yoil - 1] + "�Դϴ�.";
	}
	
	
}
