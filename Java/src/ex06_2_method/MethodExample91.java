//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
//�̰��� �޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.

package ex06_2_method;

public class MethodExample91 {
	
 //����������  ��ü�������� ���ٰ���  ��ȯ�Ǵ� ���� �ڷ���       �޼����̸� (�Ű����� ���)
	public      static           void                main(String args[]) {
		
		int[] num = {1, 2, 3, 4, 5};
		print(num);//�� ���� ���� �ѱ�� ������ �޸��� ����ϸ� �˴ϴ�.
		return;//���⼭ main()�޼��带 �����մϴ�.
	}

	//�޼��� ����
	public static void print(int[] num)//�ڷ����� ��ġo �������� ���x 
	{
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		//or ���� for��
		//for(int a : num) {
			//System.out.print(a + " ");
			
		return;//��ȯ�Ǵ� ���� �ڷ����� void�� ��� �� ������ ���� �����մϴ�.
	}
}
