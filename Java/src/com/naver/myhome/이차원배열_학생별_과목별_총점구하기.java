package com.naver.myhome;

public class �������迭_�л���_����_�������ϱ� {
	public static void main(String[] args) {
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", "����", "����" };
		int[][] score = { 
				{ 85, 60, 70 }, // 0��("��ȣ��")
				{ 90, 95, 80 }, // 1��("�̽±�")
				{ 75, 80, 100 }, // 2��("���缮")
				{ 80, 70, 95 }, // 3��("����")
				{ 100, 65, 80 } // 4��("�̱���")
		};
		int[] subject = new int[3]; // �������� ����
		int[] student = new int[5]; // �л��� ���� ����
		
		int r, c;

		System.out.println();
		for (int i = 0; i < 10; i++)
			System.out.print("=");

		System.out.print(" �л���   /  ���� �������ϱ�  ");
		for (int i = 0; i < 10; i++)
			System.out.print("=");

		System.out.print("\n\t");
		for (c = 0; c < 3; c++)
			System.out.print(sub_name[c] + "\t");

		System.out.print("����\t���");

		for (r = 0; r < 5; r++) {                     //r=1                                                                                    
			System.out.print("\n" + name[r] + "\t");  //��ȣ��        �̽±�                                                

			for (c = 0; c < 3; c++) {                 //c=0                c=1                   c=2         
				System.out.print(score[r][c] + "\t"); //85   90                60 95                   70
				student[r] += score[r][c];            //student[1]=90      student[1]=90+95      student[0]=85+60+70
				subject[c] += score[r][c];            //subject[0]=85+90      subject[1]=60+95         subject[2]=70
			}
			//System.out.print(student[r] + "\t" + student[r] / 3 );
			System.out.printf("%d\t%.1f",student[r] , student[r] / 3.0 );
		}

		System.out.println();
		for (int i = 0; i < 45; i++)
			System.out.print("=");

		System.out.print("\n" + "����" + "\t");
		for (c = 0; c < 3; c++)
			System.out.print(subject[c] + "\t");
	}// main() end
}// class end
	


