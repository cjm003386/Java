package ex11_7_Math;

public class MathExample1 {
	public static void main(String args[]) {
		
		System.out.println("12.45 �ݿø�?" + Math.round(12.45));//12
		System.out.println("124.5 �ݿø�? " + Math.round(124.5)); //125
		
		//12.45�� �ݿø��ؼ� 12.5�� ����� ������
		
		System.out.println(Math.round(12.45*10));//125
		System.out.println(Math.round(12.45*10)/10.0); //12.5
		
		
		
	}

}
