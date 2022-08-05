package ex06_1_array;

//5개의 과목 점수를 입력받아 배열에 저장한 후 총점, 평균 구하기
//정수 5개를 입력하세요?
//10 20 30 40 50
//합 = 150
//평균 = 30.0

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String argsp[]) {
		int sum=0;
		double avg=0;
		int score[] = new int[5];
		
		System.out.println("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			score[i]=sc.nextInt();
			sum += score[i];
		}
		
		avg=(double)sum/(score.length); //avg=(double)sum/5;
		System.out.println("합 =" + sum+"\n평균="+avg);
		
		System.out.println("==============");
		System.out.printf("합 =%5d\n평균 =%5.1f", sum, avg);
		sc.close();
		
	}

}
