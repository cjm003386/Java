package ex05_3_while;

public class While01_2 {
	public static void main(String[] args) {
		
		// 1~31 ���� 1�� �����ϰ� �� �ٿ� 7���� ����ϱ�
		int i = 0;
		while (++i <= 31) { //i�� 1������ �� i<=31�� ���մϴ�.
			System.out.printf("%5d",i);
			if(i%7 == 0)
				System.out.println();
		}
	}

}
