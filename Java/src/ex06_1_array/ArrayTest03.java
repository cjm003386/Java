package ex06_1_array;

//�ִ밪 �ּҰ� ���ϱ�

public class ArrayTest03 {
	public static void main(String args[]) {
		int score[] = {20, 30, 40, 80, 10};
		//max, min�� �ʱⰪ���� �迭�� �� �߿��� �����մϴ�.
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max<score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				min=score[i];
			}
		}
		//�񱳿����� ���?
		/* for (int i = 1; i < score.length; i++){
		 *  max = (max > score[i]) ? max : score[i];
		 *  min = (min < score[i]) ? min : score[i];*/
		
		System.out.println("max= "+ max);
		System.out.println("min= "+ min);
	}

}
