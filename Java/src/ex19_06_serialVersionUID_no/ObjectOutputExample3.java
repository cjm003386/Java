//��ü�� ����ȭ�ϴ� ���α׷�
package ex19_06_serialVersionUID_no;

import java.io.*;

class ObjectOutputExample3 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100,200);
			System.out.println(obj);
			out.writeObject(obj);//��ü�� ����ȭ�ϴ� �κ�
		}
		catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				out.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
