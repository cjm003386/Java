package ex13_2;

public class ObjectExample {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("73527", 200);
		String str ="��� ���� = " + obj;
		//���ڿ��� GoodsStock ��ü ������ + �����ڷ� �����ϸ�
		//�� ��ü�� toString �޼ҵ尡 �ڵ����� ȣ��� �� ���ڿ��� ����˴ϴ�.
		//String str = "��� ���� = " + obj.toString();
		System.out.println(str);
		
	}

}
