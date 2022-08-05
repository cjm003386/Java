package ex20_4_client;

import java.io.*;
import java.net.*;

class ReceiverThread extends Thread {
	private Socket socket;

	ReceiverThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (!socket.isClosed()) {

				String str = reader.readLine();

				// ������ ������ �������� null�� �����մϴ�.
				if (str == null)
					break;

				// ���ŵ� �޽����� ����ͷ� ����մϴ�.
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
