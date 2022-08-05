package ex04_06_arithmetic_op;

public class Oper01_0 {
	public static void main(String[] args) {

		int a = 10, b = 4, c;
		c = a + b;
		System.out.println(a + "+" + b + "=" + c);

		c = a - b;
		System.out.println(a + "-" + b + "=" + c);

		c = a * b;
		System.out.println(a + "*" + b + "=" + c);

		c= a / b;
		System.out.println(a + "/" + b + "=" + c);
		
		c= a % b; // c=2 (나머지)
		System.out.println(a + "%" + b + "=" + c);
		System.out.printf("%d %% %d = %d",a,b,c);
		System.out.println();
		
		// a/b = 2.5를 만들어 봅시다.
		double d;
		d = (double)a/b;
		System.out.println(a + "/" + b + "=" + d);
		System.out.println("a"+"/"+"b"+ "=" +d);
		
				
	}


}