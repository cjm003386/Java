//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� ���մϴ�.
package ex11_3_StringTokenizer;
import java.util.*;
public class StringTokenizerExample4 {
	public static void main(String args[]) {
		
		//true : �����ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stok
		=new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		
		
		
		while(stok.hasMoreTokens()) {//��ū�� �ִ� ���� �ݺ��ϴ� �޼���
			String str = stok.nextToken();//���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
	}

}
