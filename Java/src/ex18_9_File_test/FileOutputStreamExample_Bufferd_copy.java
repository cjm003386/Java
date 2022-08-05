package ex18_9_File_test;

import java.io.*;

public class FileOutputStreamExample_Bufferd_copy {
	public static void main(String args[]) {
		String originaldir = "c:\\original";
		String targetdir = "c:\\target";
		String originalFileName = "koala.jpg";
		String targetFileName = "koala_copy.jpg";
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		try {
			in = new BufferedInputStream(new FileInputStream(originaldir + "\\" + originalFileName));

			File to = new File(targetdir);

			if (!to.exists()) {
				if (to.mkdir()) {
					System.out.println("디렉토리 생성");
				} else {
					System.out.println("디렉토리 생성 실패");
					return;
				}
			}

			out = new BufferedOutputStream(new FileOutputStream(targetdir + "\\" + targetFileName));
			int readCount;
			byte[] readBytes = new byte[1024];

			while ((readCount = in.read(readBytes)) != -1) {
				out.write(readBytes); // 1024바이트를 출력 스트림으로 보냅니다.
			}
			System.out.println("복사가 잘~ 되었습니다.");

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // Exception - IOException
			ioe.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (in != null)
					in.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
