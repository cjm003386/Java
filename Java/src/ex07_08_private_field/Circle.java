
package ex07_08_private_field;
public class Circle {
	//���� ������ private�� ���ο����� ��� ����
	private double radius;
	
	final double PI = 3.14;
	Circle(double radius){ 
		this.radius = radius;
	}
	
	double getArea() { 
		return radius * radius * PI ;
	}

}
