//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
//�̰��� �޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.

package ex06_2_method;

public class MethodExample8 {
	
 //����������  ��ü�������� ���ٰ���  ��ȯ�Ǵ� ���� �ڷ���       �޼����̸� (�Ű����� ���)
	public      static           void                main(String args[]) {
		int num=50;
		char data = '*';
		print(num, data);
	}

	//�޼��� ����
	public static void print(int p_num, char p_parameter) {
		System.out.println("print() �޼��� �Դϴ�.");
		System.out.println("main() �޼��忡�� ���޹��� ������ ����" + p_num +","+ p_parameter + "�Դϴ�.");
		
		
		
		
	}
}
