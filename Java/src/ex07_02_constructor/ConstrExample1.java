package ex07_02_constructor;

public class ConstrExample1 {
	public static void main(String args[]) {
		GoodsStock obj;          
		obj = new GoodsStock("52135", 200);
		
		
		System.out.println("상품코드" + obj.goodsCode);//필드 값 사용
		System.out.println("재고수량" + obj.stockNum);
		
		obj.addStock(1000);     //메소드 호출
		System.out.println("=====obj.addstock(1000) 후=====");
		System.out.println("상품코드" + obj.goodsCode);
		System.out.println("재고수량" + obj.stockNum);

		
		obj.subtractStock(500);
		System.out.println("=====obj.subtractStock(500) 후=====");
		System.out.println("상품코드" + obj.goodsCode);
		System.out.println("재고수량" + obj.stockNum);
		
	}

}
