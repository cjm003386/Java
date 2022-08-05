package ex07_14_static_final;

public class LimitedValue {
	//final �� static ��ġ �ٲ� �˴ϴ�.
	//final static int UPPER_LIMIT = 100000// ��� �ʵ��� ����
	static final int UPPER_LIMIT = 100000; // ��� �ʵ��� ����
	int value;
	
	void setValue(int value) {
		if (value < UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT; //��� �ʵ��� ���
	}

}
