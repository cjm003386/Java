//Rectangle Ŭ������ ����ϴ� ���α׷�
package ex08_18_interface_extends;

public class InterfaceExample {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(100,200,10,10);
		printRectangle(obj);// �簢�� : ��ġ (100,200) ũ�� (10x10)
		
		obj.moveTo(25, 35);// �簢��: ��ġ (25, 35) ũ��(10 x 10)
		printRectangle(obj);
		
		obj.moveBy(-5, 5);// �簢��: ��ġ(20, 30) ũ��(10x 10)	
		printRectangle(obj);
		
		obj.resize(30,30);// �簢��: ��ġ(20, 30) ũ��(30 x 30)
		printRectangle(obj);
	}

	private static void printRectangle(Rectangle obj) {
		System.out.printf("�簢��: ��ġ(%3d,%3d),  ũ��(%3d x %3d) %n", obj.x, obj.y, obj.width, obj.height);
		
	}

}
