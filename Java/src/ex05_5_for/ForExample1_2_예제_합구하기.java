package ex05_5_for;

public class ForExample1_2_예제_합구하기 {
	public static void main (String args[]) {
		
		// 1~10까지 1씩 증가
		System.out.println("====1씩증가====");
		int i;
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 1~10까지 2씩 증가(홀수출력)
		System.out.println("==홀수출력==");
		for (int j = 1; j <= 10; j += 2) {
			System.out.println(j);
		}
		
		// 1~10까지 2씩 증가(짝수출력)
		System.out.println("==짝수출력==");
		for(i= 2; i <= 10; i +=2) {
			System.out.println(i);
		}
		
		System.out.println("==홀수의 합==");
		int sum = 0;
		for(int j = 1; j <= 10; j= j+2) {
			sum += j;
		}
			System.out.println("1~10까지의 홀수의 합 = " + sum);
			
		System.out.println("==짝수의 합==");
		sum = 0;
		for(i = 2; i <=10; i += 2) {
			sum += i;
		}
		System.out.println("1~10까지의 짝수의 합 = " + sum);
			
		}
		
	}


