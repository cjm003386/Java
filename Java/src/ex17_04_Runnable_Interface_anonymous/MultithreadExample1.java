//Runnable�������̽��� �̿��� ��Ƽ������ ���α׷�
package ex17_04_Runnable_Interface_anonymous;

public class MultithreadExample1 {
	public static void main(String args[]) {
		//Runnable�������̽��� �����ϴ� Ŭ���� ��ü�� �����ؼ�
		//Thread �������� �Ķ���ͷ� ����մϴ�.
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (char ch = 'a'; ch <= 'z'; ch++)
					System.out.print(ch);
			}
		});//������ ����
		thread.start();
		char arr[] = {'��','��','��','��','��','��','��',
						'��','��','��','��','��','��','��'};
		
		for (char ch : arr)
			System.out.print(ch);
		}
	}


