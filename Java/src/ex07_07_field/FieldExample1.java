//Circle Ŭ���� �ȿ� ����� �ʵ带 ����ϴ� ���α׷�
package ex07_07_field;

public class FieldExample1 {
	public static void main(String args[]) {
		Circle obj = new Circle(3.5);
		double area = obj.getArea();
		System.out.println("���� ������ = " + obj.radius);
		System.out.println("���� ���� = " + area);
		
		
		
		obj.radius = 5.5;
		area = obj.getArea();
		System.out.println("���� ������ = " + obj.radius);
		System.out.println("���� ���� = " + area);
	}

	
		
	

}
