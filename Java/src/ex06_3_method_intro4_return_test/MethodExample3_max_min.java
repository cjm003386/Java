package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample3_max_min {
	public static void main(String[] args) {
		int n1, n2, max2, min2;
		System.out.print("�� ���� ������ �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);//Scanner���� ctrl+shift+o Ŭ��
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		max2=max(n1,n2);
		min2=min(n1,n2);
		
		//max2�� ����, max(n1,n2)�� max�� �޼ҵ� �̸�
		System.out.println("max = " + max2);
		System.out.println("min = " + min2);
		
		sc.close();
	}

	public static int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
			}


public static int min(int a, int b) {
	if (a<b)
		return a;
	else
		return b;
 }
}
