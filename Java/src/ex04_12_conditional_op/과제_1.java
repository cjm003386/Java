package ex04_12_conditional_op;
import java.util.Scanner;
/* 3���� ������ �Է��ϼ���? 10 20 30
   10,20,30, �� ���� ū ���� 30�Դϴ�.
   10,20,30, �� ���� �������� 10�Դϴ�.
 */
public class ����_1 {
	public static void main(String[] args) {
		
		System.out.print("3���� ������ �Է� �ϼ���?");
		int n1, n2, n3, max, min;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		

		
		max = (n1 > n2 ? n1 : n2);
		max = (max > n3) ? max : n3;
		
		min = (n1 < n2 ? n1 : n2);
		min = (min < n3) ? min : n3;
		
		
		System.out.println("max = "+max);
		System.out.println(n1 + "," + n2 + "," + n3 + " �� ���� ū ���� " + max + "�Դϴ�.");
		
		System.out.println("min = "+min);
		System.out.println(n1 + "," + n2 + "," + n3 + " �� ���� ���� ���� " + min + "�Դϴ�.");
	
		//if�� ��� ��
		max = n1;
//		
//		if (n2 > max) 
//			max = n2; 
//		if (n3 > max) 
//			max = n3; 
//		System.out.println("�ִ��� " + max + "�Դϴ�.");
//
//		
//		 min = n1;
//		
//		if (n2 < min) 
//			min = n2; 
//		if (n3 < min) 
//			min = n3; 
//		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
//

		
		
		sc.close();
		
	   
	}

}
