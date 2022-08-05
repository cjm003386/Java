package ex06_3_method_intro4_return_test;

public class MethodExample1_1_add {
	public static int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public static void main(String args[]) {
		int result = add(3, 4);
		System.out.println(result);
	}
	
	//다양한 방법
	/*public static int add(int num1, int num2) {
	return num1 + num2;
	}
	
	public static void main(String args[]) {
	System.out.println(add(3, 4));
	} */
}
