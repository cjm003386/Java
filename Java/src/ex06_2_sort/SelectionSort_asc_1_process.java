//���� ���� - �ּ� ���� ����(��������)
//���õ� �����Ϳ� �� �����͵� �� ���� ���� ���� ���Ѵ�.
package ex06_2_sort;

public class SelectionSort_asc_1_process {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("\n" + "a[" + i + "]��° ������ ����, a[j]��°�� ��(a[" + i + "]>a[j])�̸� �� ���� �ٲ۴�.");
			System.out.printf("\t\t\t%s", "���� ������: ");
			for (int k = 0; k < a.length; k++)
				System.out.printf("%3d", a[k]);

			System.out.println();
			for (int j = i + 1; j < a.length; j++) {
				System.out.print("i=" + i + "\t" + "j=" + j + "\t" + "a[" + i + "]=" + a[i] + " > a[" + j + "]="
						+ a[j] + "\t[");
				if (a[i] > a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				} // if
				for (int k = 0; k < a.length; k++)
					System.out.printf("%3d", a[k]);
				System.out.println("  ]");
			} // for j
			
			for(int k=0;k<60;k++)
			  System.out.print("=");
		} // for i
	}

}


