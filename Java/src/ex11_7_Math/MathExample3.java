//0�̻� 1�̸��� ���� �߻��ϴ� ���α׷�
package ex11_7_Math;

public class MathExample3 {
	public static void main(String args[]) {
		System.out.println(Math.random()); //0<=���� < 1 : double��
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		int num;
		/*
		 * 0���� 9������ ���� ������ ���ϴ� ������ �����
		 * 1. 0<= ���� < 1
		 * 2. 0<= ����*10 < 10
		 * 3. 0<= (int)(����*10) < 10 ==> ������ �����
		 */
		
		//���� : (����ȭ)((���Ѱ�-���Ѱ�+1)*���� + ���Ѱ�)
		//(int((9-0+1)*���� + 0)
		num = (int) (Math.random() * 10);
		System.out.println(num);
		
		// 1���� 45���� ���� ������ ���ϴ� ���� �����
		// (int)((45-1+1)*���� + 1)
		
		int Lotto;
		for(int i = 0; i < 6; i++) {
			Lotto = (int)(Math.random()* 45 + 1);
			System.out.print(Lotto + "\t");
			
			
			}
				
		}
	}


