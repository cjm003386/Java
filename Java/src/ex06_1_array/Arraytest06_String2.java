package ex06_1_array;

//�ݴ�� ã��

import java.util.Scanner;

public class Arraytest06_String2 {
	public static void main(String args[]) {
		String names[] = {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿"};
	    Scanner sc = new Scanner(System.in);
	    
	    //�� �� �濡 ����ִ��� Ȯ���ϴ� ������ �ʱⰪ -1�� �ε����� ��ġ�� �ʴ� ���� ����մϴ�.
	    int index = -1;
	    
		System.out.println("�˻��� �̸��� �Է��ϼ���?");
		System.out.print("�̸�:");
		String inputname = sc.next();
		
		for(int i = names.length-1; i >= 0; --i) {  //i=4,3,2,1,0
			if(inputname.equals(names[i])) {    
				index = i;                      
		        break; //�Է��� �̸��� ���� �̸��� ã���� �ݺ����� ����ϴ�.
			}
		}
	
	// �Է��� �̸��� �迭�� �̸��� ã���� ��
		if (index != -1) {
			System.out.println(inputname + "��(��) �迭�� �ε���" + index + "���� ã�ҽ��ϴ�.");
		}else //ã�� ������ ��	
			System.out.println(inputname + "��(��) �迭�濡�� ã�� ���߽��ϴ�.");
		
		sc.close();
	}

}
