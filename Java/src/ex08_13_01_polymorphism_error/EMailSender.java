package ex08_13_01_polymorphism_error;
class EmailSender extends MessageSender {
	String senderAddr; // 발송자 이메일 주소
	String emailBody;  // 이메일 내용
	
	EmailSender(String title, String senderName, 
				String senderAddr, String emailBody){
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	// 슈퍼 클래스의 메소드를 오버라이드하는 메소드
	// 추상 메소드를 구현(implement)
	
	void sendMessage(String recipient) {
		System.out.println("-----------------------");
		System.out.println("제목:" + title);
		System.out.println("보내는 사람:" + senderName + "\n" 
							+ "보낸 주소:" + senderAddr);
		System.out.println("받는사람:" + recipient);
		System.out.println("내용" + emailBody);
		
	}
	
	

}