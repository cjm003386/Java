//�޽����� �۽��ϴ� ������ Ŭ����
package ex20_3.server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SenderThread extends Thread {
	private Socket socket;

	SenderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		PrintWriter writer = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));

			writer = new PrintWriter(socket.getOutputStream());

			while (!socket.isClosed()) {
				// Ű����κ��� ���ڿ��� �Է¹޽��ϴ�.
				String str = reader.readLine();

				// ����ڰ� "bye"��� �Է��ϸ� �ݺ����� ���������ϴ�.
				if (str.equals("bye"))
					break;

				// �Էµ� ���ڿ��� �۽��մϴ�.
				writer.println(str);
				writer.flush();

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
