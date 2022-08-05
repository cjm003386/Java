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
					System.out.println("���丮 ����");
				} else {
					System.out.println("���丮 ���� ����");
					return;
				}
			}

			out = new BufferedOutputStream(new FileOutputStream(targetdir + "\\" + targetFileName));
			int readCount;
			byte[] readBytes = new byte[1024];

			while ((readCount = in.read(readBytes)) != -1) {
				out.write(readBytes); // 1024����Ʈ�� ��� ��Ʈ������ �����ϴ�.
			}
			System.out.println("���簡 ��~ �Ǿ����ϴ�.");

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) { // Exception - IOException
			ioe.printStackTrace();
			System.out.println("������ ���� �� �����ϴ�.");
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
