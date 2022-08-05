package ex07_15_static_method;

public class Accumulator {
	int total; //total = 0;
	static int grandTotal ; //grandTotal = 0;
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	/*
	 * ���� �޼���ȿ����� �ν��Ͻ� ����, �ν��Ͻ� �޼��� ����� �� �����ϴ�.
	 * �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü ������ ����� �� �ִ� ������̱� ������
	 * �ν��Ͻ� ������ ���þ��� static �޼���ȿ����� ����� �� �����ϴ�.
	 * ���� this�� ����� �� �����ϴ�.
	 */
	static int getGrandTotal() {  // ���� �޼��� ����
		//total = 5;             //���� �߻�
		//accumulate(100);      //���� �߻�
		return grandTotal;
	}

}
