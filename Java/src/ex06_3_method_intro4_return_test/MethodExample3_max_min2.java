package ex06_3_method_intro4_return_test;

import java.util.Scanner;
//����������

public class MethodExample3_max_min2 {
	 public static int[] max_min(int data[]) {
		  
		 /*
		  * int[] result =new int[2];
		  * result[0] = data[0]
		  * result[1] = data[0];
		  * */
		int result[] = { data[0], data[0] } ;
			
		for (int i = 1; i < data.length; i++) {
			if (result[0] < data[i]) result[0] = data[i]; //max
			if (result[1] > data[i]) result[0] = data[i]; //min
			}
			return result;
		}

	
	
	
	public static void main(String args[]) {
		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���?");
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
	  int[] result = max_min(data); //�޼��� ȣ��(����)
	  
	  System.out.println("�ִ� = " + result[0]);
	  System.out.println("�ּڰ� = " + result[1]);
	  
		sc.close();
	}


}