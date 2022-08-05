package ex18_9_File;
//���� ���丮�� ������丮�� ���� ����� ����ϴ� ���α׷�
//File Ŭ���� : ���� ���� ����� ���� Ŭ����
//���丮 ���� ��ɵ� ������ �ֽ��ϴ�.
//%-25s : 25ĭ�� �������� ����
//%1$tf : YYYY-mm-dd ������ ��¥
//%1$tT : HH:MM:SS ����
import java.io.*;
import java.util.*;

class FileExample1_0 {
	public static void main(String args[]) {
		//���� ���丮 ��θ��� ������ File ��ü�� �����մϴ�.
		File file = new File("."); //���� ���丮(.), ���� ���丮(..)
		File arr[] = file.listFiles(); //���� ���丮�� ���� ����� �����ɴϴ�.
		
		for (int cnt = 0; cnt < arr.length; cnt++) {
			String name = arr[cnt].getName();//�̸��� ����
			
			if(arr[cnt].isFile())//�����̸� true �ƴϸ� false
				//arr[cnt].length():������ ũ�� (����Ʈ)
				System.out.printf("%-25s %7d \t", name,arr[cnt].length());
			else
				System.out.printf("%-25s <DIR> \t", name);
			
			//1970�� 1�� 1�� 0�� 0�� 0�� �������� ����� �и������� ���� ����
			//����� ������ �� �ִ� ��¥�� �ð����� ������ �ʿ䰡 �ֽ��ϴ�.
			long time = arr[cnt].lastModified();// ���� ���� �Ͻø� ����
//			System.out.printf("%d\n", time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			//setTimeInMillis�޼ҵ�� ��ü�� ������ �ִ� �ð� ������ �Ķ���� ������ �����ϴ� �޼ҵ�
			//�̶� �Ķ���ʹ� 1970�� 1�� 1�� 0�� 0�� 0�� �������� ����� �и������� ���̾�� �մϴ�.
			
			calendar.setTimeInMillis(time);
			//1$ : ���� ���ڿ� ������ ���� ù ��° �Ķ���� (calendar)
			//%1$tF : YYYY-mm-dd ������ ��¥
			//1%$tT : HH:MM:SS ����
			//System.out.printf("%1$tF %1$tT \n" , calendar);
			System.out.printf("%tF %tT \n", calendar, calendar);
		}
	}

}
