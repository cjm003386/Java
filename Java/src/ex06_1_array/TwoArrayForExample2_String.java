//2���� �迭�� ���� for������ �ۼ��ϱ�
package ex06_1_array;

public class TwoArrayForExample2_String {
	public static void main(String args[]) {
		String arr[][] = { {"����", "���"},
				           {"���̽�ũ��","�޷γ�"},
				           {"Ŀ��"}  };
	// ���� for��
		for(String n : arr[0]) {
			System.out.println(n);
		}
		
		System.out.println("===============");
		for(String[] i : arr) {
			for(String n : i)
				System.out.printf("%s\t", n);
			System.out.println();
			}
		
		System.out.println("��.");
		
	}

}
