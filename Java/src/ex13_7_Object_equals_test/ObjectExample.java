package ex13_7_Object_equals_test;

public class ObjectExample {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 30);
		Rectangle r2 = new Rectangle(10, 30);
		System.out.println(r1);
		System.out.println(r2);
		
		if (r1.equals(r2))
			System.out.println("r1.equals(r2) ����");
		else
			System.out.println("r1.equals(r2) �ٸ�");
		
		if (r1 == r2)
			System.out.println("r1==r2 ����");
		else
			System.out.println("r1==r2 �ٸ�");
	}

}
