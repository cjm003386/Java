//continue �߸����� ��
//0 1 2 3 4�� ���
package ex05_7_continue;

public class ContinueExample2_1 {
	public static void main(String args[]) {
		int cnt = 0;
		while (cnt < 10) { // cnt=0      1 .. 5
						  //  cnt<10    1<10 5<10    5<10
							// x         x    o       o
			if (cnt == 5)
				continue;
			System.out.println(cnt);//0    1 ..  4
			cnt++;		            //1    2 ..  5
		}
		System.out.println("��.");
	}

}
