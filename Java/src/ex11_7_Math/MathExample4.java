//1~45���� �ߺ� ���� �� 6�� �߻��ϴ� ���α׷�
package ex11_7_Math;

public class MathExample4 {
	public static void main(String args[]) {
	int Lotto[] = new int[6]; //�ߺ��� ������ Ȯ���ϰ��� �迭 �����

	for (int i = 0; i < Lotto.length; i++) {	   //i=0 			i=1 		i=1
		Lotto[i] = (int) (Math.random() * 45 + 1);//Lotto[0]=30   Lotto[1]=30   Lotto[1]=40     
		
		for (int j = 0; j < i; j++) {		//		j=0;j<1
			if (Lotto[i] == Lotto[j]) {		//		Lotto[1] == Lotto[0]
													//i=0
				i--;
				break;
			}
		}

	}
	for (int i = 0; i < Lotto.length; i++) {

		System.out.print(Lotto[i] + "\t");
	}

}
}


