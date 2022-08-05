package ex04_10_rel_logic_op;

/*
  -�ܶ� ��(short circuit evaluation)
  1. && ������ ��� ù��° �ǿ����ڸ� ���ؼ� false�� 
  ��� �ι�° �ǿ����ڸ� �������ʰ� false�� ��ȯ�մϴ�.
   2. || ������ ��� ù��° �ǿ����ڸ� ���ؼ� true�� 
   ��� �ι�° �ǿ����ڸ� ������ �ʰ� true�� ��ȯ�մϴ�.
 */
public class LogicalExample6 {
	public static void main(String[] args) {
		int a = 20, b = 20;

		if (a >= 20 && ++b >= 20) { // a>=20 ���̱⿡ ++b>=20 ������
			System.out.println("��:" + b);
		} else {
			System.out.println("����: " + b);
		}

		System.out.println(b);
		System.out.println("==========");

		a = 10;
		b = 20;
		if (a >= 20 && ++b >= 20) { // a>=20 �����̱⿡ ++b>=20 �������
			System.out.println("�� :" + b);
		} else {
			System.out.println("���� " + b);
		}
		System.out.println(b);
		
		
		
		System.out.println();
		
        a= 20;
        b= 20;
        		
		if (a >= 20 || ++b >= 20) { // a>=20 ���̹Ƿ� �� ��° �ǿ����� �� x
			System.out.println("��:" + b);
		} else {
			System.out.println("����: " + b);
		}

		System.out.println(b);
		System.out.println("==========");

		a = 10;
		b = 20;
		if (a >= 20 || ++b >= 20) { // a>=20�� �����̹Ƿ� �� ��° �ǿ����� �� o
			System.out.println("�� :" + b);
		} else {
			System.out.println("���� " + b);
		}
		System.out.println(b);
	}

}
