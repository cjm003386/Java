//사람클래스에서 수지와 박보검을 만듭니다.
//객체의 멤버변수 출력하기
package ex07_00_object;

public class Saram_make2 {
    public static void main(String[] args) {
    	Saram2 s = new Saram2();
    	s.name = "수지";    	s.age = 24;		s.w = 47;		s.ki = 168;
		s.eat();		s.sesu();		s.walk();
		
		Saram2 s2 = new Saram2();
		s2.name = "박보검";		s2.age = 23;		s2.w = 65;
		s2.ki = 182;
		s2.eat();
	}
}


