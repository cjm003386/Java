package ex05_5_for;

public class ForExample1_2_����_�ձ��ϱ� {
	public static void main (String args[]) {
		
		// 1~10���� 1�� ����
		System.out.println("====1������====");
		int i;
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 1~10���� 2�� ����(Ȧ�����)
		System.out.println("==Ȧ�����==");
		for (int j = 1; j <= 10; j += 2) {
			System.out.println(j);
		}
		
		// 1~10���� 2�� ����(¦�����)
		System.out.println("==¦�����==");
		for(i= 2; i <= 10; i +=2) {
			System.out.println(i);
		}
		
		System.out.println("==Ȧ���� ��==");
		int sum = 0;
		for(int j = 1; j <= 10; j= j+2) {
			sum += j;
		}
			System.out.println("1~10������ Ȧ���� �� = " + sum);
			
		System.out.println("==¦���� ��==");
		sum = 0;
		for(i = 2; i <=10; i += 2) {
			sum += i;
		}
		System.out.println("1~10������ ¦���� �� = " + sum);
			
		}
		
	}


