package ex08_13_01_polymorphism_error;
class EmailSender extends MessageSender {
	String senderAddr; // �߼��� �̸��� �ּ�
	String emailBody;  // �̸��� ����
	
	EmailSender(String title, String senderName, 
				String senderAddr, String emailBody){
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	// ���� Ŭ������ �޼ҵ带 �������̵��ϴ� �޼ҵ�
	// �߻� �޼ҵ带 ����(implement)
	
	void sendMessage(String recipient) {
		System.out.println("-----------------------");
		System.out.println("����:" + title);
		System.out.println("������ ���:" + senderName + "\n" 
							+ "���� �ּ�:" + senderAddr);
		System.out.println("�޴»��:" + recipient);
		System.out.println("����" + emailBody);
		
	}
	
	

}