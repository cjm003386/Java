package ex18_3_1FileinputStream_FileOutputStream;

import java.io.*;

public class FileInputStreamExample1 {
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("���ϸ��� Arguments�ǿ� output1.dat�Է��� �ּ���~");
			return;
		}
		FileInputStream in=null;
		try {
			in = new FileInputStream(args[0]); //������ ����.
			//Run->Run configurations���� �Ű����� ������ output1.dat �Է�
			
			byte arr[] = new byte[21];//����Ʈ ������ �����͸� �б� ������ byte�� ���
			while (true) {
				int num = in.read(arr); //���Ϸκ��� 21 ����Ʈ�� �д´�.
				//int java.io.FileInputStream.read(byte[] b) throws IOException
				
				if(num < 0) //�о�� �����Ͱ� -1�̸� �ݺ��� �ߴ�
					break;
				
				//�о���� ����Ʈ �����͸� 16������ ����Ѵ�.
				System.out.println("\n16���� ���");
				for (int cnt = 0; cnt < num; cnt ++)
					System.out.printf("%02X " ,arr[cnt]);
				//%02X : 2�ڸ� 16����(%X)�� ����ϵ�,
				//�빮��(X�� �빮����)�� ����ϸ鼭 ���ڰ� �� �ڸ��̸� ���ڸ��� 0���� ä���
				//%02x : 2�ڸ� 16����(%x)�� ����ϵ�,
				//�ҹ���(x�� �ҹ�����)�� ����ϸ鼭 ���ڰ� �� �ڸ��̸� ���ڸ��� 0���� ä���.
				
				System.out.println("\n\n10���� ���");
				for (int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02o", arr[cnt]);
				
			}
		}catch (FileNotFoundException fnfe) {
			System.out.println(args[0] + "������ �������� �ʽ��ϴ�.");
		}catch (IOException ioe) {
			System.out.println(args[0] + "������ ���� �� �����ϴ�.");
		}finally {
			try {
				in.close();//������ �ݽ��ϴ�.
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
