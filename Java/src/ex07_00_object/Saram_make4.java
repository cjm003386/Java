//사람클래스에서 수지와 박보검을 만듬
//매개 변수 두 개인 생성자 호출하기
package ex07_00_object;

public class Saram_make4 {
    public static void main(String[] args) {
		Saram4 s = new Saram4("수지", 47.4);
		//s.name = "수지";
		s.age = 17;
		//s.w = 47.4;
		s.ki = 160;
		s.eat();
		s.walk();
		
		Saram4 s2 = new Saram4("박보검", 65);
		//s2.name = "박보검";
		s2.age = 23;
		//s2.w = 65;
		s2.ki = 182;
		s2.eat();
		s2.walk();
		
		
	}
}
