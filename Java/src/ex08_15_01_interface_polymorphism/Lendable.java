//대출 가능 인터페이스
package ex08_15_01_interface_polymorphism;
interface Lendable {
	void checkOut(String borrower, String date);
	void checkIn();
}
