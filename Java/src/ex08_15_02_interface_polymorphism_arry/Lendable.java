//대출 가능 인터페이스
package ex08_15_02_interface_polymorphism_arry;
interface Lendable {
	void checkOut(String borrower, String date);
	void checkIn();
}
