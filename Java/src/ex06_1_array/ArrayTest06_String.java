/*String names[] = {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿"};
  String inputname = sc.next();
  
 ����1. �迭 ����� �� �Է��� ���
 ������ȭ��) 
 �˻��� �̸��� �Է��ϼ���?
 �̸�:ȫ�浿 
 ȫ�浿��(��) �迭�� �ε��� 2���� ã�ҽ��ϴ�.
 *
 
 ����2. �迭 ����� ���� �ƴ� �����͸� �Է��� ���
 ������ȭ��)
 �˻��� �̸��� �Է��ϼ���?
 �̸�:HTA
 HTA��(��) �迭�濡�� ã�� ���߽��ϴ�.
 */

package ex06_1_array;

import java.util.Scanner;

public class ArrayTest06_String {
	public static void main(String args[]) {
		String names[] = {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿"};
	    Scanner sc = new Scanner(System.in);
	    
	    //�� �� �濡 ����ִ��� Ȯ���ϴ� ������ �ʱⰪ -1�� �ε����� ��ġ�� �ʴ� ���� ����մϴ�.
	    int index = -1;
	    
		System.out.println("�˻��� �̸��� �Է��ϼ���?");
		System.out.print("�̸�:");
		String inputname = sc.next();
		
		for(int i = 0; i < names.length; i++) {  //int i=0,     1,       2,     3,         4
			if(inputname.equals(names[i])) {      //    "ȫ�浿"  "����ġ" "ȫ�浿"  "�������"  "��浿"
				index = i;                      //      0                2       
		       break;
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

