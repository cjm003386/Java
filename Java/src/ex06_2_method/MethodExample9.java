//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
//�̰��� �޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.

package ex06_2_method;

public class MethodExample9 {
	
 //����������  ��ü�������� ���ٰ���  ��ȯ�Ǵ� ���� �ڷ���       �޼����̸� (�Ű����� ���)
	public      static           void                main(String args[]) {
		int num=50;
		char data = '*';
		print(num, data);
	}

	//�޼��� ����
	public static void print(int n, char parameter)//�ڷ����� ��ġo �������� ���x 
	{
		for(int i=0; i<n; i++) {
			System.out.print(parameter);
			
		}
			
	}
}
