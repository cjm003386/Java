//���ڿ��� �Էµ� ���� ���� ó���ϱ� ���� ���?
package ex14_1_Wrapper;

public class Wrapper2_2_Stirng_to_int {
	public static void main(String args[]) {
		int total = 0;
		
		//���1.
		//String -> Integer ��ü
		//Integer ��ü -> int�� ��
		for(int cnt = 0; cnt < args.length; cnt++) {
			System.out.println("args[" + cnt + "]=" + args[cnt]);
			
			//���ڷ� ���� ���ڿ��� ������ Integer��ü�� �����մϴ�.
			Integer obj = Integer.valueOf(args[cnt]);
			
			//Integer ��ü �ȿ� �ִ� int ���� �����ɴϴ�.
			total += obj.intValue();
		}
		System.out.println("�� = " + total);
		
		//���2.
		//String -> int
		int total2=0;
		for(int cnt = 0; cnt < args.length; cnt++) {
			total2 += Integer.parseInt(args[cnt]);
		}
		System.out.println("�� = " + total2);
	}
}
