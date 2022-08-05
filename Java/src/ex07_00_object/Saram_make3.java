//사람클래스에서 수지와 박보검을 만듬
//매개 변수 한 개인 생성자 호출하기
package ex07_00_object;

public class Saram_make3 {
    public static void main(String[] args) {
		Saram3 s = new Saram3("수지");
		//s.name = "수지";
		s.age = 17;
		s.w = 47.7;
		s.ki = 160;
		s.eat();
		
		Saram3 s2 = new Saram3("박보검");
		s2.age = 23;
		s2.w = 65;
		s2.ki = 182;
		s2.eat();
		
	}
}
