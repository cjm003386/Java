//�޽����� �۽��ϴ� ������ Ŭ����
package ex20_4_client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SenderThread extends Thread {
	private Socket socket;
	private String name;//�߰�

	SenderThread(Socket socket, String name) { //����
		this.socket = socket;
		this.name=name; //�߰�
	}

	public void run() {
		PrintWriter writer = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));

			writer = new PrintWriter(socket.getOutputStream());

			//�߰�
			//���� ���� ������ ��ȭ���� �۽��մϴ�.
			writer.println(name);
			writer.flush();
			
			//Ű����� �Էµ� �޽����� ������ �۽��մϴ�.
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
