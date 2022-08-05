package ex07_00_object;

public class Saram6 {
	String name;
	double w;
	double ki;
	int age;

	// 생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 합니다.
	Saram6(String name, double w, double ki, int age) {
		/*
		 *  this란?
		 *  자바는 객체를 참조할 수 있도록 this 키워드를 제공합니다.
		 *  참조변수로 인스턴스 자신의 주소가 저장되어 있습니다.
		 *  생성자와 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재합니다.
		 */
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;
		
	}

	// 생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 합니다.
	Saram6(String name2, double w2) {
		this.name = name2;
		w = w2;
	}

	// 생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 한다.
	Saram6(double w, String name) {
		this.name = name;
		this.w = w;
	}

	public void eat() {
		System.out.println(this.name + " 밥을 먹는다.");
	}

	public void walk() {
		System.out.println(this.name + "(이)가 걷기전 몸무게는  " + w + "입니다 .");
	}

	public void sesu() {
		System.out.println(this.name + " 세수한다.");
	}

}
