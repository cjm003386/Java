package ex06_1_array;

public class ArrayExample2_init {
	public static void main(String args[]) {
		int arr[]; // �迭 ���� ����
		arr = new int[10]; // �迭 ����: ������ ���ÿ� �ڵ������� �ڽ��� Ÿ�Կ�
                           // �ش��ϴ� �⺻������ �ʱ�ȭ �˴ϴ�.
		
		for (int i = 0; i < 10; i++)
			System.out.println("arr[" + i + "]=" + arr[i]);
	
		System.out.println("==========================");
	
		// arr.length:�迭�� ũ��
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]=" + arr[i]);
			
	}

}
