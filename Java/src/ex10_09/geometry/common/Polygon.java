//protected ������Ҹ� �����ϴ� Ŭ������ ��
//protected�� ���� ����, �޼ҵ�� ���� ��Ű������ Ŭ���� �Ǵ�
//�ش� Ŭ������ ��ӹ��� �ܺ� ��Ű���� Ŭ�������� ������ �����մϴ�.
package ex10_09.geometry.common;

public class Polygon {
	public int x[];
	protected int y[];		//�������� Y ��ǥ
	protected Polygon(int size) { // ������
		x = new int[size];
		y = new int[size];
	}
	// �������� ��ǥ�� �����Ѵ�.
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}

}
