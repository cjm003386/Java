package ex07_08_final_field;

public class Circle { 
	double radius;
	final double PI = 3.14;
	
	
	
	Circle(double radius){ //생성자
		this.radius = radius;
	}
	
	double getArea() { //메서드
		return radius * radius * PI ;
	}

}
