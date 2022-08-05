//���� �簢�� Ŭ������ �޼ҵ带 �߰��� ���
//���� �߻�: ����ȭ�� �� ����� Ŭ������
//������ȭ�� �� ����� Ŭ������ ������ �ٸ��� ����
package ex19_06_serialVersionUID_no;

public class Rectangle implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "����: " + width + "\n����: " + height;
	}
	
	/*������
	 * 
	 * 1. �Ʒ� getArea �޼ҵ��� �ּ��� �ް� ������ ���״� ���� ����
	 * ObjectOutputExample.java�� ����
	 * ObjectInputExample.java ����
	 * 
	 * 2. �Ʒ� �޼ҵ��� �ּ��� Ǭ �� - ���� �߻�
	 * ObjectInputExxample.java ����	
	 * 
	 * serialVersionUID�� ���� Ŭ�������� �˷��ִ� �ĺ��� ������ �ϸ�
	 * Serializable �������̽��� ������ Ŭ������ �������ϸ� �ڵ�������
	 * serialVersionUID ���� �ʵ尡 �߰��˴ϴ�.
	 * 
	 * serialVersionUID�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ����� ��
	 * �ڵ����� �ο��Ǵµ� ����ȭ ���� Ŭ������ ������ �״���̸� ���� ��ȣ�� �ο��ǰ�
	 * Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� serialVersionUID�� �ο��˴ϴ�.
	 * 
	 * ������ ��������� Ŭ������ serialVersionUID�� ����Ǿ� ������
	 * ������ �� �߰� ���� �ʱ� ������ ������ ���� ������ �� �ֽ��ϴ�.
	 * 
	 *  */
	

	  int getArea(){
	  return width * height;
	  }
	 
	
	

}
