//������ ���� : ��ü�� ������Ҹ� �ܺη� ���� ���ߴ� ���
package ex07_08_private_field;

public class FieldExample4 {
	public static void main(String args[]) {
		Circle2 obj = new Circle2(5.5);
		double area = obj.getArea();
		System.out.println("���� ������ =" + obj.getRadius());
		System.out.println("���� ���� = " + area);
		
		obj.setRadius(10.5);
		area = obj.getArea();
		System.out.println("���� ������ =" + obj.getRadius());
		System.out.println("���� ���� = " + area);
	}

}
