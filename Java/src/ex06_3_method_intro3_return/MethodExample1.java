package ex06_3_method_intro3_return;

public class MethodExample1 {
	//����������  ��ü�������� ���ٰ���  ��ȯ�Ǵ� ���� �ڷ���       �޼����̸� (�Ű����� ���)
		public      static           void                main(String args[]) {
			hap(1,10); //�ƹ��͵� ��µ��� �ʽ��ϴ�.
			
   }
		               //��ȯ��
	public static   int     hap(int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum += i;
				
		}
		return sum;//sum�� �ڷ����� �޼����� ��ȯ���� ��ġ�ؾ� �մϴ�.
	}
}