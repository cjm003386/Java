//대출 가능 인터페이스
package ex08_14_02_interface;

interface Lendable {
	//대출한다.
	abstract void checkOut(String borrower, String date);
	
	//반납한다.
	abstract void checkIn();
}
