//객체를 직렬화하는 프로그램
package ex19_06_serialVersionUID_no;

import java.io.*;

class ObjectOutputExample3 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100,200);
			System.out.println(obj);
			out.writeObject(obj);//객체를 직렬화하는 부분
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
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
