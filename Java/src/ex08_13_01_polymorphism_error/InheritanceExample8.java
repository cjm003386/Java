package ex08_13_01_polymorphism_error;

public class InheritanceExample8 {
	public static void main(String agrs[]) {
		EmailSender obj1 = 
				new EmailSender("������ �����մϴ�", "������",
			"admin@khshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");


	SMSSender obj2 = new SMSSender("������ �����մϴ�.", "������",
				"02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
	
	send(obj1, "hataman@yeyeye.com");
	send(obj1, "stickman@hahaha.com");
	send(obj2, "010-000-0000");
}
	
	/*
	  1. MessageSender obj : ���� Ŭ���� Ÿ���� �Ķ����
	  2. MessageSender Ŭ�������� sendMessage �޼ҵ带 �ּ� ó���� ���
	  	���� �߻��մϴ�.
	  3. �ڹ� �����Ϸ��� ������ Ÿ������ �� �޼ҵ尡 �ִ��� ������ üũ�մϴ�.
	  	MEssageSender�� sndMessage()�޼��尡 �������� �ʾƼ�
	  	The method sendMEssage(String) is undefined for the type
	 	������ �߻��߽��ϴ�.
	   4. �ڹ� ���� ���(JVM)�� ��ü�� �޼ҵ带 ȣ���� �� ������ Ÿ�Կ� �������
	  	��ü�� ���ϴ� Ŭ������ �޼ҵ带 ȣ���մϴ�.*/
	
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
		//��� Ŭ������ snedMessage �޼ҵ尡 ȣ��ɱ��?
		//EmailSendr �Ǵ� SMSSender
		
	}
	
}