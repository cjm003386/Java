package ex06_1_array;

//최대값 최소값 구하기

public class ArrayTest03 {
	public static void main(String args[]) {
		int score[] = {20, 30, 40, 80, 10};
		//max, min의 초기값으로 배열의 값 중에서 설정합니다.
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
		//비교연산자 사용?
		/* for (int i = 1; i < score.length; i++){
		 *  max = (max > score[i]) ? max : score[i];
		 *  min = (min < score[i]) ? min : score[i];*/
		
		System.out.println("max= "+ max);
		System.out.println("min= "+ min);
	}

}
