package ex06_1_array;

//5���� ���� ������ �迭�� ���� �Ҵ��� �� ���� ���ϱ�
//����:95,70,80,75,100
//�迭��: score
//�ڷ���: int

public class ArrayTest01 {
	public static void main(String args[]) {
		int score[] = {95, 70, 80, 75, 100};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "]=" + score[i]);
			sum=sum+score[i];
			
		}
		System.out.println("����="+sum);
	}

}
