package ex10_09.geometry.shape;
import ex10_09.geometry.common.Polygon;

public class Square extends Polygon{
	public Square(int x, int y, int sideLength) {
		super(4); //���� Ŭ������ protected ������ ȣ��
		setPoint(0, x, y); //���� Ŭ������ protected �޼ҵ� ȣ��
		setPoint(1, x + sideLength, y);
		setPoint(2, x + sideLength, y + sideLength);
		setPoint(3, x, y + sideLength);
	}
	public int getX(int index) {
		return x[index];
	}
	public int getY(int index) {
		return y[index];			//����Ŭ������ protected �ʵ� ���
	}
	
	/*sideLength=10�� ���
	 * 		.(0,0)		.(10,0)
	 		  x y		x+10, y
	 		  index=0	index=1
	 		  
	 		  
	 		.(0,10)		.(10,10)
	 *		 x,y+10		x+10, y+10
	 *		 index=3	index=2
	 */

}
