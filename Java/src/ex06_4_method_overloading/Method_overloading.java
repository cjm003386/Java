//�����ε��� �̿��� �ִ밪 ���ϱ�
/*
 * �ڹٴ� �޼��� �ñ״�ó�� ����� �޼��带 �����մϴ�.
 * �޼��� �ñ״�ó(Method Signature)�� �޼��� �̸��� �Ű����� ����, ������ Ÿ��, ������ �ǹ��մϴ�.
 * �޼��� �̸��� �����ϴ��� �Ű����� ����, ������ Ÿ��, ���� ��
 * �ϳ��� �ٸ��� �ٸ� �޼���� �����ϴ� ���� �޼��� �����ε��̶�� �մϴ�.
 * �ڹٴ� ��ȯ Ÿ������ �޼��带 �������� �ʽ��ϴ�. 
 * */
package ex06_4_method_overloading;

public class Method_overloading {
	public static int max(int n1, int n2) {
		return n1>n2?n1:n2;
		
	}
	
	public static int max(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2 ) max = n2;
		if(max < n3 ) max = n3;
		return max;
	}
	
	public static int max(int n1, int n2, int n3, int n4) {
		int max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		if(max < n4) max = n4;
		return max;
		
	}
//duplicate method max(int, int, int, int,) in type Method_overloading
	//��ȯ���� �޼��� �����ε� ���ǰ� �����ؼ� ���� �޼���� �����ϰ� ����� ���� �߻��մϴ�.
/*
  public static String max(int n1, int n2, int n3, int n4) {
		int max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		if(max < n4) max = n4;
		return "��ȯ�� String : " + max; 
 */
	
	
	public static void main(String args[]) {
		System.out.println("max(10,20) = " + max(10,20));
		System.out.println("max(10,20,30) = " + max(10,20,30));
		System.out.println("max(10,20,30,40) = " + max(10,20,30,40));
	}
	
	
}
