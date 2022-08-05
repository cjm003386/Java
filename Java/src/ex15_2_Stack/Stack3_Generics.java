package ex15_2_Stack;
import java.util.Stack;
public class Stack3_Generics {
	public static void main(String[] args) {
		//LiFo(Last Input First Output) ���� - ���������� �Էµ� �ڷᰡ ���� ���� ��µǴ� ����
		//Stack ��ü ����
		Stack<String> s = new Stack<String>();
		System.out.println("�������? " + s.empty()); // true - ������� �Ǵ�
		
		// Stack�� ���� ����
		s.push("���ƿ�");
		s.push("�ڹ�");
		
		System.out.println("�������? " + s.empty()); //false:��������Ǵ�
		
		//������ ������ �������� �޼ҵ�
		System.out.println("�� ������ ������ : " + s.peek());
		
		// Stack�� ���� ���
		while (!s.empty()) {
			System.out.println("������ ��� : " + s.pop());
			System.out.println("���� ������ ���� :" + s.size());
		}
		
		System.out.println("�������? " + s.empty()); //true-������� �Ǵ�
		
		
	}

}
