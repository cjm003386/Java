package ex07_02_constructor;

public class ConstrExample1 {
	public static void main(String args[]) {
		GoodsStock obj;          
		obj = new GoodsStock("52135", 200);
		
		
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
