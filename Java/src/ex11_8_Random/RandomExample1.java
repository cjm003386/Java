package ex11_8_Random;

import java.util.*; // Random Ŭ������ java.util ��Ű���� ����

public class RandomExample1 {
	public static void main(String args[]) {
		
	
	Random random = new Random(); //�Ķ���� ���� ������
	
	//0���� 100�̸��� ������ ���� �߻�- ��, 0���� 99������ ������ ���� �߻�
	System.out.println(random.nextInt(100));
	System.out.println(random.nextInt(100));
	System.out.println(random.nextInt(100));
	
	//1���� 45������ ���� �߻�
	System.out.println("1~45������ ���� �߻� :" + (random.nextInt(45)+1));
	
	/*
	 * 0 < = random.nextInt(45)		<= 44
	 * 
	 * 1 < = random.nextInt(45) + 1 <= 44 + 1
	 */
	
	for(int i=0;i<6;i++) {
		System.out.println((random.nextInt(45)+1)+ "\t");
		}
	}
}