package ex03_1_literal; // 값

public class Literal1_pirntf {
	public static void main(String args[]) {
		System.out.printf("%f", 42.195);
		System.out.println();
		System.out.printf("%d\n", 42);
		System.out.printf("%10d\n", 42);
		System.out.printf("%c%n", 'A');
		System.out.printf("%s%n", "홍길동");
		System.out.printf("%10s\n","홍길동" );
		System.out.printf("\n나의 이름은 %s, 나의 나이는 %d세 입니다.", "홍길동",21);
		System.out.printf("\n나의 이름은 %10s, 나의 나이는 %10d세 입니다", "홍길동", 21);
		System.out.printf("\n나의 이름은 %-10s, 나의 나이는 %-5d세 입니다", "홍길동", 21);
		
		
	}
}
