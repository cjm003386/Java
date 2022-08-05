package ex06_1_array;

public class ArrayExample3_1 {
	public static void main(String args[]) {
		//방법1.
		int arr[];        //배열 선언
		arr = new int[5]; //배열 생성
		
		//배열 사용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열 출력
		System.out.println("arr[" + "0" + "]=" + arr[0]);
		System.out.println("arr[" + "1" + "]=" + arr[1]);
		System.out.println("arr[" + "2" + "]=" + arr[2]);
		System.out.println("arr[" + "3" + "]=" + arr[3]);
		System.out.println("arr[" + "4" + "]=" + arr[4]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		//방법2
		
		//int arr[] = new int[5];
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
				arr[3] = 40;
				arr[4] = 50;
				
		
	   // 방법3

	   // int arr[] = {10, 20, 30, 40, 50,};
	   // for (int i = 0; i < arr.length; i++)
	   // System.out.println("arr[" + i + "]=" + arr[i]);
		
	}

}
