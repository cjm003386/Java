//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� ���մϴ�.
package ex11_3_StringTokenizer;
import java.util.*;
public class StringTokenizerExample3{
	public static void main(String args[]) {
		
		//������-�޸�(,)�� ������(|)
		StringTokenizer stok
		=new StringTokenizer("��� ,�� ,������",",|");
			
		
		while(stok.hasMoreTokens()) {//��ū�� �ִ� ���� �ݺ��ϴ� �޼���
			String str = stok.nextToken();//���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
	}

}
