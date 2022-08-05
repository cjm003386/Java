package ex18_6_Buffered2_flush2;
import java.io.*;
public class BufferedWriterExample3 {
	public static void main(String args[]) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("src/ex18_6_Buffered2_flush2/output.txt");
			
			//두 번째 인자는 버퍼 사이즈를 의미 - 버퍼에 5개의 문자를 저장할 수 있습니다.
			bw = new BufferedWriter(fw,5);
			
			char arr[] = {'내', '꺼', '인', '1', '듯',
						  '2', '내',  '꺼', '3', '아', 
						  '닌', '4', '내', '꺼', '5', 
						  '같', '은', '6', '너'};
			for (int cnt = 0; cnt < arr.length; cnt++)
				bw.write(arr[cnt]);
			
			/*
			 * 버퍼에 있는 데이터 파일에 즉시 출력하도록 하는 메소드입니다.
			 */
		}catch (IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");
		}
		finally {
			try {
				bw.close(); //보조 기반 스트림이 정상저으로 닫힐 때
							//자동으로 flush()메소드를 호출합니다.
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
