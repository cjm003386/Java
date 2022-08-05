package ex06_1_array;

public class TwoArrayForExample1_int {
	public static void main (String args[]) {
		int arr[][] = { {10, 20},
				        {30, 40},
				        {50}
		              };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
		for (int[] a : arr) { // arr�� ����Ű�� �ִ� �� ��ҵ��� ������ �迭�� ����Ű�� �ֽ��ϴ�.
			for(int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("��.");

	}
}