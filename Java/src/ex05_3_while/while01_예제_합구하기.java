package ex05_3_while;

public class while01_예제_합구하기 {
	public static void main(String agrs[]) {
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("1 부터 10 까지의 합은 "+ sum +" 입니다.");
	}

}
