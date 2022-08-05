
package ex08_15_02_interface_polymorphism_arry;

//대출 가능 인터페이스를 구현하는 부록 CD 클래스

class APPCDInfo extends CDInfo implements Lendable {
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태
	String writer; //추가된 부분

	APPCDInfo(String registerNo, String title, String writer) { //추가된 부분
		super(registerNo, title);
		this.writer = writer; //추가된 부분
	}

	// public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	// 대출한다
	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + title + " CD가 대출되었습니다.");
		System.out.println("저  자: " + writer); //추가된 부분
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키워드
	public void checkIn() { // 반납한다
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + " CD가 반납되었습니다.\n");
	}

}
