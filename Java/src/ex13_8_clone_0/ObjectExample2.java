//clone()�޼ҵ�� ��ü�� �����ϴ� ����� �մϴ�.
//��, �Ȱ��� ���� ���� ��ü�� �� �� �� ����ϴ�.
//���� ������ Ŭ������ ���ؼ��� ȣ���� �� �ֽ��ϴ�.


package ex13_8_clone_0;

;

class ObjectExample2 {
	public static void main(String args[]) {
		//��ü�� �����մϴ�.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone �޼���� ��ü�� �����մϴ�.
		Rectangle obj2 = (Rectangle) obj1.clone(); 
		//Rectangle Ŭ�������� implements Cloneable ���� �ʾ� ���� �߻�
		
		//���� ��ü�� ���� ��ü�� ���� ����մϴ�.
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
		
		obj1.height = 100; obj1.width=200;
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
	}
	

}
