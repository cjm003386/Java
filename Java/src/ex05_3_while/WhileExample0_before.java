//�ݺ���
package ex05_3_while;

public class WhileExample0_before {
	public static void main(String args[]) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println("===============");
		
		int cnt=0;                    // 0
		while(cnt < 10) {             // 0<10    1<10   2<10
			//�ݺ���
			System.out.println(cnt); //0         1      2 ... 9
			cnt++;                   //1         2      3
			
			}
		System.out.println("======1======");
		
		cnt = 0;
		while (cnt < 10) {
			System.out.println(cnt++);
			
		}
		System.out.println("======2======");
		
		cnt = -1;
		while (++cnt < 10) { //���ϱ�, cnt<10
			System.out.println(cnt);
			
		}
		System.out.println("======3-1======");
		
	}

}
