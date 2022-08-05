//���� ���α׷�
//���� ���� : ���� ���α׷� ���� -> Ŭ���̾�Ʈ ���α׷� ����
package ex20_3.server;

import java.io.*;
import java.net.*;

class ServerExample3 {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.~");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			System.out.println("========== ���� ���� ==========");
			System.out.println(socket.getInetAddress().getHostAddress() 
								+ "���� �����Ͽ����ϴ�.");
			System.out.println("=============================");
			//�� �����带 �����մϴ�.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 �����մϴ�.
			thread1.start();
			thread2.start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
//			SenderThread, ReceiverThread���� ����ϴ� socket�� �ݾ��ָ� �ȵ˴ϴ�.
//			try {
//				socket.close(); // ������ �ݽ��ϴ�.
//			} catch (Exception ignored) {
//				System.out.println("������ �ݴ� �� �����Դϴ�.");

			}
			try {
				serverSocket.close(); // ���� ������ �ݽ��ϴ�.

			} catch (Exception ignored) {
				System.out.println("���� ������ �ݴ� �� �����Դϴ�.");
			}
		}
	}


