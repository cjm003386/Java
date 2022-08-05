package ex19_04_1_Serializable_interface;

import java.io.*;

class ObjectOutputExample3 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("ȫ�浿", "HTA-L2", "7�� ����", "������ �� �� �ִ� ���");
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
