//���� ���α׷�
package ex20_4_server;
import java.net.*;
public class ServerExample {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�.~");
		ServerSocket serverSocket = null;
		try {
			//�� ������ while���� ���� �ʵ��� ������ �ּ���. ���� ������ �Ѱ� ���� ����մϴ�.
			serverSocket = new ServerSocket(9002);
			while (true) {
				//���� ��û�� ���� ������ �����մϴ�.
				//accept �޼ҵ� : ���� �������� ���� ��û�� ������ ������ �ΰ�
				//Ŭ���̾�Ʈ ������ �����ؼ� �����ϴ� �޼ҵ�
				Socket socket = serverSocket.accept();
				
				//��û�� �� ������ ������ ����
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
