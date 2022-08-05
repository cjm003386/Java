package ex08_13_01_polymorphism;

public class InheritanceExample8 {
	public static void main(String agrs[]) {
		EmailSender obj1 = 
				new EmailSender("생일을 축하합니다", "고객센터",
			"admin@khshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");


	SMSSender obj2 = new SMSSender("생일을 축하합니다.", "고객센터",
				"02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
	//서브 클래스 객체 obj1, obj2를 가지고 메소드를 호출
	send(obj1, "hataman@yeyeye.com");
	send(obj1, "stickman@hahaha.com");
	send(obj2, "010-000-0000");
}
	//MessageSender obj : 슈퍼 클래스 타입의 파라미터
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
		//어느 클래스의 snedMessage 메소드가 호출될까요?
		//EmailSendr 또는 SMSSender
		
	}
	
}