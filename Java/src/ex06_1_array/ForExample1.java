package ex06_1_array;

public class ForExample1 {
	public static void main(String args[]) {
		int arr[] = {10, 20, 30, 40, 50};
		
		//���� for��, Ȯ�� for�� (jdk 1.5�̻�)
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("End");
	}
}
