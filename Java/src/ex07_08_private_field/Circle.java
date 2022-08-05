
package ex07_08_private_field;
public class Circle {
	//접근 제어자 private는 내부에서만 사용 가능
	private double radius;
	
	final double PI = 3.14;
	Circle(double radius){ 
		this.radius = radius;
	}
	
	double getArea() { 
		return radius * radius * PI ;
	}

}
