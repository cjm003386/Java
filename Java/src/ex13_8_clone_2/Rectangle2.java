package ex13_8_clone_2;

public class Rectangle2 {
	int width, height;
	
	/*���� ��ȯ Ÿ��(covariant return type) - JDK1.5���� ����
	 * �������̵��� �� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������
	 * ����ϴ� ���Դϴ�.
	 * ��, ��ȯ���� Object���� �ڼ� Ŭ���� Ÿ������ ������ ����մϴ�.
	 * 
	 * ������ : clone()ȣ�� �� �� ��ȯ�� �ʿ�����ϴ�.(main �޼���)
	 * Rectangle obj2 = (Rectangle) obj1.clone();
	 * ==> Rectangle obj2 = obj1.clone();
	 * */
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2 clone() {
		try {
			//���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �� ����� �����մϴ�.
			return (Rectangle2) super.clone();
		}
		//���� Ŭ������ clone�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		return "width=" + width + ", height=" + height;
	}

}
