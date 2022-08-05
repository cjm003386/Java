package ex08_17_interface_exception;

class SeparateVolume3 implements Lendable {
	String requestNo;      // 청구번호
    String bookTitle;      // 제목
    String writer;         // 저자
    String borrower;       // 대출인
    String checkOutDate;   // 대출일
    byte state;            // 대출상태
    SeparateVolume3(String requestNo, String bookTitle, String writer){
    	this.requestNo = requestNo;
    	this.bookTitle = bookTitle;
    	this.writer = writer;
    }
    //부모의 예외는 IOException
    //자식의 예외는 Exception
    //Exception - IOException 관계로 오버라이딩 하는 곳에서
    //예외 범위가 더 커서 오류가 발생합니다.
    public void checkOut(String borrower, String date)
    							throws Exception {  //대출한다.
    	if (state != STATE_NORMAL) //처음 state 값은?(0)
    		return;
    	this.borrower = borrower;
    	this.checkOutDate = date;
    	this.state = STATE_BORROWED; //대출상태 : state=1
    	System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
        System.out.println("대출인:" + borrower);
        System.out.println("대출일:" + date + "\n"); 
    	}
    
        public void checkIn() {  //반납한다.
        	this.borrower = null;
        	this.checkOutDate = null;
        	this.state = STATE_NORMAL;	//반납 상태 : state=0
        	 System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
        }
    
    
}
