//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� ���մϴ�.


/*
 * ��ǰ�̸� ��ǰ ��
 * ��� 		10
 * ���ݷ�		3
 * ������		1
 * */
 
package ex11_3_StringTokenizer;
import java.util.*;
public class StringTokenizerExample5 {
	public static void main(String args[]) {
		
		//true : �����ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stok
		=new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		System.out.println("��ǰ�̸�\t��ǰ ��");
		
		
		while(stok.hasMoreTokens()) {//��ū�� �ִ� ���� �ݺ��ϴ� �޼���
			String token = stok.nextToken();
			if (token.equals("=")) {
				System.out.print("\t");
			}else if (token.equals("|")) {
				System.out.print("\n");
			}else {
				System.out.print(token);
			}
				
			}
	}

}
