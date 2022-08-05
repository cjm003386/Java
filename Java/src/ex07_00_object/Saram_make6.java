//사람클래스에서 수지와 박보검을 만듬
package ex07_00_object;

public class Saram_make6 {
    public static void main(String[] args) {
		Saram6 s = new Saram6("수지", 47.7, 160, 24);
		s.eat();
		s.walk();
		
		Saram6 s2 = new Saram6("박보검", 65, 182, 23);
		s2.eat();
		s2.walk();
		
		Saram6 s3 = new Saram6("홍길동", 80.5);
		s3.age=18;
		
	}
}
