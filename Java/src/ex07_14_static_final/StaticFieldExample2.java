//��� �ʵ带 ����ϴ� ���α׷�
package ex07_14_static_final;

public class StaticFieldExample2 {
	public static void main(String args[]) {
		System.out.println("���Ѱ� = " + LimitedValue.UPPER_LIMIT);
		
		LimitedValue v = new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value = " + v.value);
		
		System.out.println("������ ���Ѱ� = " + Integer.MAX_VALUE);
		System.out.println("������ ���Ѱ� = " + Integer.MIN_VALUE);
		
		
	}

}
