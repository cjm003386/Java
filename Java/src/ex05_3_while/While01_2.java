package ex05_3_while;

public class While01_2 {
	public static void main(String[] args) {
		
		// 1~31 까지 1씩 증가하고 한 줄에 7개씩 출력하기
		int i = 0;
		while (++i <= 31) { //i를 1증가한 후 i<=31을 비교합니다.
			System.out.printf("%5d",i);
			if(i%7 == 0)
				System.out.println();
		}
	}

}
