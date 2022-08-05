package ex19_03_Serialization_interface;

import java.io.*;

public class ObjectOutputExample2 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			out.writeObject(new GoodsStock("70101",100));
			out.writeObject(new GoodsStock("70102",50));
			out.writeObject(new GoodsStock("70103",200));
			System.out.println("���Ϸ� ��µǾ����ϴ�.");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}finally {
			try {
				out.close();
			}catch (Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}//finally end
	}//main end

}//class end
