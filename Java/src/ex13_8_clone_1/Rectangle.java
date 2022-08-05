package ex13_8_clone_1;


public class Rectangle implements Cloneable {
	int width, height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		}
	
	/* Object Ŭ������ ���ǵ� clone()
	 * protected Object clone() throws CloneNotSupportedException;
	 * ==>�������̵��� ���� ������ ����
	 * (protected => public : ��Ӱ��� ���� �ٸ� Ŭ�������� ȣ�� �� �� �ֽ��ϴ�.)
	 * 
	  */

	public Object clone() { //��ȯ���� Object�� �Դϴ�.
		try {
			//���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �� ����� ����
			return super.clone();
		}
		//���� Ŭ������ clone�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		return "width=" + width + ", height=" + height;
		
	}
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return this.width == r.width && this.height == r.height;
		} else
			return false;
		}
		
	}

