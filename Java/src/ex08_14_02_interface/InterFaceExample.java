//단행본 클래스와 부록 CD 클래스를 사용하는프로그램
package ex08_14_02_interface;

public class InterFaceExample {
	public static void main(String args[]) {
		SeparateVolume obj1
		= new SeparateVolume("836ㅂ774개", "개미", "베르베르");
		obj1.checkOut("홍길동", "2021-10-25");
		obj1.checkIn();
	}

}
