//StringTokenizer�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�
//���� ���ڸ� �������� ��ū�� ���մϴ�.
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample1_1 {
	public static void main(String args[]) {
		StringTokenizer stok=new StringTokenizer("��� �� ������");
		
		String s1 = stok.nextToken();
		System.out.println(s1);
		
		String s2 = stok.nextToken();
		System.out.println(s2);
		
		String s3 = stok.nextToken();
		System.out.println(s3);
		
		//��Ÿ�� ���� �߻�-������ ��ū�� �� �̻� ����
		String s4 = stok.nextToken();
		System.out.println(s4);
		System.out.println("==========================");
		
	}

}
