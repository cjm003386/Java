package ex07_02_constructor;

public class ConstrExample2_method {
	public static void main(String args[]) {
		GoodsStock obj;
		obj = new GoodsStock("52135", 200); 
		print(obj);
		
		obj.addStock(1000);
		System.out.println("=====obj.addstock(1000) ��=====");
		print(obj);
		
		obj.subtractStock(500);
		System.out.println("=====obj.addstock(500) ��=====");
		print(obj);
	}

	private static void print(GoodsStock obj) {

		System.out.println("��ǰ�ڵ�" + obj.goodsCode);
		System.out.println("������" + obj.stockNum);
		
		
	}

	

}
