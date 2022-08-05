package ex06_1_array;

//5개의 과목 점수를 배열에 값을 할당한 후 총점 구하기
//점수:95,70,80,75,100
//배열명: score
//자료형: int

public class ArrayTest01 {
	public static void main(String args[]) {
		int score[] = {95, 70, 80, 75, 100};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "]=" + score[i]);
			sum=sum+score[i];
			
		}
		System.out.println("총점="+sum);
	}

}
