package ex14_1_Wrapper;

public class Wrapper1_boxing_unboxing {
	public static void main(String args[]) {
		
		//���� 351������
		Integer obj = new Integer(12); //�ڹ� jdk 1.9���� deprecated
		
		//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼ҵ带 �̿��ؼ� ��ü �����մϴ�.
		//�ڽ� - �⺻�� Ÿ���� ���� ��ü�� ��ȯ
		//int -> Integer
		Integer obj1 = Integer.valueOf(12);
		Integer obj2 = Integer.valueOf(7);
		
		//��ڽ� - ��ü�� �⺻�� Ÿ���� ������ ��ȯ
		//Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue(); //Integer ��ü �ȿ� int���� �����ɴϴ�.
		int sum = n1 + n2;
		System.out.println(sum);
		
		//String -> Integer
		Integer n02 = Integer.valueOf("20");//�ڽ��� �ƴմϴ�.
										//"20"�� ���ڿ��� �⺻���� �ƴմϴ�.
		
		//Integer -> int
		int n3 = n02.intValue();//��ڽ� �̷����, �̰����� ����ȯ�� �̷�����ϴ�.
		sum = n1 + n2 + n3;
		System.out.println(sum);

		
	}

}
