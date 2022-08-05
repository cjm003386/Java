package ex18_6_Buffered2_flush2;
import java.io.*;
public class BufferedWriterExample2 {
	public static void main(String args[]) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex18_6_Buffered2_flush2/output.txt");
			
			//�� ��° ���ڴ� ���� ����� �ǹ� - ���ۿ� 5���� ���ڸ� ������ �� �ֽ��ϴ�.
			bw = new BufferedWriter(fw,5);
			
			char arr[] = {'��', '��', '��', '1', '��',
						  '2', '��',  '��', '3', '��', 
						  '��', '4', '��', '��', '5', 
						  '��', '��', '6', '��'};
			for (int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			
			/*
			 * ���ۿ� �ִ� ������ ���Ͽ� ��� ����ϵ��� �ϴ� �޼ҵ��Դϴ�.
			 */
			bw.flush();
		}catch (IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");
		}
		finally {
			try {
				fw.close(); //���� ���ۿ� ���� �ִµ� ��� ��Ʈ�� �ݽ��ϴ�.
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
