package ex06_1_array;

public class ForExample2 {
	public static void main(String args[]) {
	   String names[] = {"�ֹ���", "�ϸ���","������","������"};
	   
	   for(String name : names) {
		   System.out.println(name);
	   }
	   
	   //���� for��
	   for(int i =0; i<names.length; i++) {
		   System.out.println(names[i]);
		   }
	}

}
