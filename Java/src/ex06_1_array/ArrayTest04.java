package ex06_1_array;

//�Է¹��� ������ �ִ밪 �ּҰ� ���ϱ�

import java.util.Scanner;

public class ArrayTest04 {
	public static void main(String args[]) {
		int score[];
		score = new int[5];
		
		
		System.out.println("���� 5���� �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		score[0]=sc.nextInt();
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
		score[i]=sc.nextInt();
		if(max<score[i]) max = score[i];
		if(min>score[i]) min = score[i];
		}
		
		System.out.println("max="+max+"\nmin="+min);
		sc.close();
	}

}
