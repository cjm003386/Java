package ex05_test_5¿ù9ÀÏ;

import java.util.Scanner;

public class board6 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner (System.in);
		System.out.print("limit : ");
		int limit = sc.nextInt();
		
		System.out.print("listcount : ");
		int listcount = sc.nextInt();
		
		int maxpage1 =(listcount-1)/limit + 1;
		System.out.println(listcount + "=>" + maxpage1);
		
		int maxpage2 = (listcount - 1 + limit) / limit;
		System.out.println(listcount + "=>" + maxpage2);
		
		sc.close();
	}
}
