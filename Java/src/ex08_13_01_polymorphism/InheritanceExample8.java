package ex08_13_01_polymorphism;

public class InheritanceExample8 {
	public static void main(String agrs[]) {
		EmailSender obj1 = 
				new EmailSender("������ �����մϴ�", "������",
			"admin@khshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");


	SMSSender obj2 = new SMSSender("������ �����մϴ�.", "������",
				"02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
	//���� Ŭ���� ��ü obj1, obj2�� ������ �޼ҵ带 ȣ��
	send(obj1, "hataman@yeyeye.com");
	send(obj1, "stickman@hahaha.com");
	send(obj2, "010-000-0000");
}
	//MessageSender obj : ���� Ŭ���� Ÿ���� �Ķ����
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
		//��� Ŭ������ snedMessage �޼ҵ尡 ȣ��ɱ��?
		//EmailSendr �Ǵ� SMSSender
		
	}
	
}