package ex07_15_static_method;

public class StaticMethodExample2 {
	public static void main(String args[]) {
		// ���� �޼��� ȣ�⹮
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("�Ѱ� = " + grandTotal);
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		// ���� �޼��� ȣ�⹮
		grandTotal = Accumulator.getGrandTotal();
		
		//�ν��Ͻ� �޼��� print()�� ���� �޼����� main()���� ȣ���� �� �����ϴ�.
		//print(obj1);
		//print(obj2); //�� �޼��带 ����ϱ� ���ؼ���?
		System.out.println("�Ѱ� = " + grandTotal);
		
	}//main() end

	void print(Accumulator a) {
		System.out.println("total = " + a.total);
		
	}//print end

}
