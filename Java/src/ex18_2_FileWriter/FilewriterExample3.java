package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FilewriterExample3 {
	public static void main(String args[]) {
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("src/ex18_2_FileWriter/Gugudan.txt");
			
			for(int dan = 2; dan <=9; dan++) {
				writer.write("[" + dan + "단]" + "\t");
			}
			for (int i = 1; i <= 9; i++) {
				writer.write("\n");
			for(int j = 2; j <= 9; j++) {//각 단 출력
					writer.write(j +"*"+i+"="+(j*i)+"\t");
			}
			}
			}catch (IOException ioe) {
				System.out.println("파일로 출력할 수 없습니다.");
			}
			
			finally {
				try {
					writer.close();// 파일을 닫습니다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
	}
}
