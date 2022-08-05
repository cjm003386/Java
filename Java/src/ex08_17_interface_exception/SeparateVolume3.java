package ex08_17_interface_exception;

class SeparateVolume3 implements Lendable {
	String requestNo;      // û����ȣ
    String bookTitle;      // ����
    String writer;         // ����
    String borrower;       // ������
    String checkOutDate;   // ������
    byte state;            // �������
    SeparateVolume3(String requestNo, String bookTitle, String writer){
    	this.requestNo = requestNo;
    	this.bookTitle = bookTitle;
    	this.writer = writer;
    }
    //�θ��� ���ܴ� IOException
    //�ڽ��� ���ܴ� Exception
    //Exception - IOException ����� �������̵� �ϴ� ������
    //���� ������ �� Ŀ�� ������ �߻��մϴ�.
    public void checkOut(String borrower, String date)
    							throws Exception {  //�����Ѵ�.
    	if (state != STATE_NORMAL) //ó�� state ����?(0)
    		return;
    	this.borrower = borrower;
    	this.checkOutDate = date;
    	this.state = STATE_BORROWED; //������� : state=1
    	System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
        System.out.println("������:" + borrower);
        System.out.println("������:" + date + "\n"); 
    	}
    
        public void checkIn() {  //�ݳ��Ѵ�.
        	this.borrower = null;
        	this.checkOutDate = null;
        	this.state = STATE_NORMAL;	//�ݳ� ���� : state=0
        	 System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
        }
    
    
}
