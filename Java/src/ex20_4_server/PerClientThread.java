//�� Ŭ���̾�Ʈ ���ӿ� ���� �ϳ��� �۵��ϴ� ������ Ŭ����
package ex20_4_server;

import java.util.*;
import java.net.Socket;
import java.io.*;

class PerClientThread extends Thread {
	// ArrayList ��ü�� ���� �����尡 ���ÿ� ����ϰ� �Ǹ� ������ �߻��� �� �־�
	// �����ϰ� ������ �� �ִ� ����ȭ�� ����Ʈ�� ����ϴ�.
	// ����ȭ�� ����Ʈ�� ����� ���� java.util.Collections Ŭ������
	// synchronizedList �޼��带 �̿��մϴ�.
	private static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

	private Socket socket;
	private PrintWriter writer;

	PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer); // ����Ʈ�� ������ ��� ��Ʈ���� ����մϴ�.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		String name = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//			  senderThread.java����
//			  writer.println(name);
//			  writer.flush();
//			  �� ���� name�� �Ʒ��� ���忡�� �о�ɴϴ�.
			// ���ŵ� ù��° ���ڿ��� ��ȭ������ ����ϱ� ���� �����մϴ�.
			name = reader.readLine();
			sendAll("#" + name + "���� �����̽��ϴ�");

			while (!socket.isClosed()) {
				String str = reader.readLine();

				// ������ ������ �������� null�� �����մϴ�.
				if (str == null)
					break;

				// ���ŵ� �޽��� �տ� ��ȭ���� �ٿ��� ��� Ŭ���̾�Ʈ�� �۽��մϴ�.
				sendAll(name + ">" + str);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			list.remove(writer);

			// ����ڰ� ä���� �����ߴٴ� �޽����� ��� Ŭ���̾�Ʈ�� �����ϴ�.
			sendAll("#" + name + "���� �����̽��ϴ�.");

			try {
				reader.close();
			} catch (Exception ignored) {
				System.out.println("���� �ݴ� �߿� ���� �߻��߽��ϴ�.");
			}
		}

	}//run end

	// ������ ����� ��� Ŭ���̾�Ʈ�� �Ȱ��� �޽����� �����ϴ�.
	synchronized private void sendAll(String str) {
		for (PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}

	}
}
