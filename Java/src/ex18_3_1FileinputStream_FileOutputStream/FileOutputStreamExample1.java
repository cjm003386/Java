package ex18_3_1FileinputStream_FileOutputStream;
import java.io.*;
public class FileOutputStreamExample1 {
	public static void main(String args[]) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("output1.dat");//������ ����.
			byte arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
							10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
			
			//������ �ݺ��ؼ� byteŸ�� �����͸� ����
			for (int cnt = 0; cnt < arr.length; cnt++)
				out.write(arr[cnt]);
			}
		catch (IOException ioe)
		{
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
		finally {
			try {
				out.close(); //������ �ݽ��ϴ�.
				System.out.println("������ �����߽��ϴ�.");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
