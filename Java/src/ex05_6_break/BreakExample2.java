package ex05_6_break;

public class BreakExample2 {
	public static void main(String args[]) {

		int row;
		int col;
		
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 5; col++) {
				System.out.println("(" + row + "," + col + ")");
				if ((row == 1) && (col == 3))
					break; // break�� �����ϴ� �ݺ��� ������ ��� �̵��մϴ�.
			}
		}
		System.out.println("��");
	
	}

}
