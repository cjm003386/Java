//생성자를 추가한 GoodsStock클래스
package ex07_02_constructor;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) {
		if(stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}

}
