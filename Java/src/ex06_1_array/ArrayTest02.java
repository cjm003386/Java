package ex06_1_array;

//5���� ���� ������ �Է¹޾� �迭�� ������ �� ����, ��� ���ϱ�
//���� 5���� �Է��ϼ���?
//10 20 30 40 50
//�� = 150
//��� = 30.0

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String argsp[]) {
		int sum=0;
		double avg=0;
		int score[] = new int[5];
		
		System.out.println("���� 5���� �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			score[i]=sc.nextInt();
			sum += score[i];
		}
		
		avg=(double)sum/(score.length); //avg=(double)sum/5;
		System.out.println("�� =" + sum+"\n���="+avg);
		
		System.out.println("==============");
		System.out.printf("�� =%5d\n��� =%5.1f", sum, avg);
		sc.close();
		
	}

}
