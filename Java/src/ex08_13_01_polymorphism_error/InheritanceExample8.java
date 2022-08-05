package ex08_13_01_polymorphism_error;

public class InheritanceExample8 {
	public static void main(String agrs[]) {
		EmailSender obj1 = 
				new EmailSender("생일을 축하합니다", "고객센터",
			"admin@khshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");


	SMSSender obj2 = new SMSSender("생일을 축하합니다.", "고객센터",
				"02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
	
	send(obj1, "hataman@yeyeye.com");
	send(obj1, "stickman@hahaha.com");
	send(obj2, "010-000-0000");
}
	
	/*
	  1. MessageSender obj : 슈퍼 클래스 타입의 파라미터
	  2. MessageSender 클래스에서 sendMessage 메소드를 주석 처리할 경우
	  	에러 발생합니다.
	  3. 자바 컴파일러는 변수의 타입으로 그 메소드가 있는지 없는지 체크합니다.
	  	MEssageSender에 sndMessage()메서드가 존재하지 않아서
	  	The method sendMEssage(String) is undefined for the type
	 	에러가 발생했습니다.
	   4. 자바 가상 기계(JVM)는 객체의 메소드를 호출할 때 변수의 타입에 상관없이
	  	객체가 속하는 클래스의 메소드를 호출합니다.*/
	
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
		//어느 클래스의 snedMessage 메소드가 호출될까요?
		//EmailSendr 또는 SMSSender
		
	}
	
}