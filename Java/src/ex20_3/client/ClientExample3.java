//Ŭ���̾�Ʈ ���α׷�
package ex20_3.client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientExample3 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�.~");
		Socket socket = null;
		try {

			socket = new Socket("127.0.0.1", 9001);
			// �ΰ��� �����带 �����մϴ�.
			Thread thread2 = new ReceiverThread(socket);
			Thread thread1 = new SenderThread(socket);
			// �ΰ��� �����带 �����մϴ�.
			thread1.start();
			thread2.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// socket.close(); // ������ ������ �ȵ˴ϴ�.

	}

}
