package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FilewriterExample3 {
	public static void main(String args[]) {
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("src/ex18_2_FileWriter/Gugudan.txt");
			
			for(int dan = 2; dan <=9; dan++) {
				writer.write("[" + dan + "��]" + "\t");
			}
			for (int i = 1; i <= 9; i++) {
				writer.write("\n");
			for(int j = 2; j <= 9; j++) {//�� �� ���
					writer.write(j +"*"+i+"="+(j*i)+"\t");
			}
			}
			}catch (IOException ioe) {
				System.out.println("���Ϸ� ����� �� �����ϴ�.");
			}
			
			finally {
				try {
					writer.close();// ������ �ݽ��ϴ�.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
	}
}
