
package ex19_01_Serialization;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputExample1 {
	public static void main(String agrs[]) {
		// ������ ���ϴ�.
		//ObjectInputStream Ŭ������ ��Ʈ�� ���·� �о���� ��ü�� ���α׷�����
		//����� �� �ִ� ��ü�� ����� ����� Ŭ�����Դϴ�.
		//�� Ŭ������ FileInputStream Ŭ������ �Բ� ����ϸ�
		//���Ͽ� ����� ��ü�� ���α׷����� �ٽ� �о ����� �� �ֽ��ϴ�.
		//FileInputStream ��ü�� �����ؼ�
		//ObjectInputStream ������ �Ķ���ͷ� �Ѱ��־�� �մϴ�.
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
				//��ü�� ������ȭ�ϴ� �κ�
				//readObject �޼ҵ� : �Էµ� ��Ʈ�����κ��� ��ü�� ���� �����ϴ� �޼ҵ�� ����Ÿ���� Object�Դϴ�.
				//����Ÿ�� Object�� ������ Ŭ���� Ÿ������ ����ϱ� ���� ĳ��Ʈ ������ �ؾ��մϴ�.
				//readObject()�� Object���̹Ƿ� GregorianCalendar Ÿ������ �� ��ȯ �մϴ�.
				
			GregorianCalendar calendar = (GregorianCalendar) in.readObject();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH)+1;
			int date = calendar.get(Calendar.DATE);
			System.out.println(year+"/"+month+"/"+date);
		
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ��� ó���մϴ�.
			System.out.println("��");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close(); // ������ �ݽ��ϴ�.
			} catch (Exception e) {
				System.out.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}

}

