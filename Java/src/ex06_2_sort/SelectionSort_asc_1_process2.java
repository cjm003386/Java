//���� ���� - �ּ� ���� ����(��������)
//���õ� �����Ϳ� �� �����͵� �� ���� ���� ���� ���Ѵ�.
package ex06_2_sort;

public class SelectionSort_asc_1_process2 {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {	
				if (a[i] > a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				} // if

			} // for j

		} // for i
		for (int su : a) {
			System.out.print(su + "\t");
		}
	}
}
	




