package ex05_test;

public class Test {
	public static void main (String args[]) {

		for (int j = 1; j <= 1; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 1; j <= 2; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 1; j <= 3; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 1; j <= 4; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 1; j <= 5; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("==========");
		
		int line=5;
		for (int i = 1; i <= line; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("=========");
		//¿ª¼ø
		line=5;
		for(int i =1; i <= line; i++) {            //1     2     3      4    5
			for(int j = 1; j <= line+1-i; j++) {  //1~5   1~4    1~3   1~2  1~1
				System.out.print("*");
			}                                    // i + j = 6 = line + 1
			System.out.println();                     // j = line + 1 - i = 6 -i
		}    
	
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				
			System.out.print("*");
		}
			System.out.println();
	}
}
}