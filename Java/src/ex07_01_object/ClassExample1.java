//GoodsStock Ŭ������ ��ü�� �����ؼ� ����ϴ� ���α׷�
package ex07_01_object;

public class ClassExample1 {
	public static void main(String args[]) {
		GoodsStock obj;          //���� ����
		obj = new GoodsStock(); //��ü ����
		//GoodsStock obj = new GoodsStock();
		
		obj.goodsCode = "52135";     //�ʵ忡 ���� ����
		obj.stockNum = 200;         //�ʵ忡 ���� ����
		System.out.println("��ǰ�ڵ�" + obj.goodsCode);//�ʵ� �� ���
		System.out.println("������" + obj.stockNum);
		
		obj.addStock(1000);     //�޼ҵ� ȣ��
		System.out.println("=====obj.addstock(1000) ��=====");
		System.out.println("��ǰ�ڵ�" + obj.goodsCode);
		System.out.println("������" + obj.stockNum);

		
		obj.subtractStock(500);
		System.out.println("=====obj.subtractStock(500) ��=====");
		System.out.println("��ǰ�ڵ�" + obj.goodsCode);
		System.out.println("������" + obj.stockNum);
		
	}

}
