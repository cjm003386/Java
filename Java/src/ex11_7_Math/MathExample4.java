//1~45까지 중복 없는 수 6개 발생하는 프로그램
package ex11_7_Math;

public class MathExample4 {
	public static void main(String args[]) {
	int Lotto[] = new int[6]; //중복된 데이터 확인하고자 배열 사용함

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


