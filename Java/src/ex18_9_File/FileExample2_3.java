//File Ŭ������ �̿��Ͽ� ����, ���丮 ���� �� ���� ����
package ex18_9_File;

import java.io.*;

public class FileExample2_3 {
	public static void main(String args[]) {
		String dir = "C:\\newDirectory\\newFile.txt";
		// ���� ����
		File f3 = new File(dir);
		if (f3.exists()) {
			if (f3.delete()) {//���� ����
				System.out.println(f3.getPath() + "�����߽��ϴ�.");
			} else {
				System.out.println(f3.getPath() + " ���� ���� ���߽��ϴ�.");
			}
		} else {
			System.out.println(f3.getPath() + "�� �����ϰ��� �ϴ� ������ �����ϴ�.");
		}
	}
}
