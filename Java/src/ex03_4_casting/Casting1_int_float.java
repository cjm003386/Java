package ex03_4_casting;

public class Casting1_int_float {
	public static void main(String args[]) {
		
		int i1=10; //정수형 변수 i1에 10을 대입합니다.
		//1. 자동 형변환, 묵시적 형변환, 암시적 형변환
		//자동 형변환은 변수에 값을 지정하거나 메서드의 인지값이 매개변수로 전달 될 때
		//일치하지 않은 자료형인 경우 컴파일러가 자동으로 형변환을 해주는 것입니다.
		//double d1 = (double)i1;
		double d1=i1;
		System.out.println("d1 데이터는 " + d1 + "입니다.");
		
	}

}
