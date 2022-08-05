package ex05_5_for;

public class ForExample4_3dan {
	public static void main(String args[]) {
		
		int dan=2, i;
		System.out.println("["+dan+"단]");
		for(i=1;i<=9;i++) {
		System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		dan=3;
		System.out.println("["+dan+"단]");
		for(i=1;i<=9;i++) {
		System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		dan=4;
		System.out.println("["+dan+"단]");
		for(i=1;i<=9;i++) {
		System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		
		//이중 for문
		System.out.println("[구구단]");
		for(dan=2;dan<=9;dan++) {
			for(i=1;i<=9;i++)
		System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}

}
