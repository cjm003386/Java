package ex17_05_daemon_thread;

public class ThreadEx {
	public static void main(String[] args) {
		Thread t = new Thread(new Threadautosave());
		//t.setDaemon(true); // �� �κ��� ������ ������� �ʽ��ϴ�.
							//���� ������� ����ϴ�.
		t.start();
		
		for (int i=1; i<=30; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if(i==5)
				Threadautosave.autoSave=true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
