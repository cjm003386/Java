package com.naver.myhome;

public class ����_05_11 {
	public static void main(String args[]) {
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
		
		System.out.println("========= �л���  /  ���� ���� ���ϱ� =========");
		
		int r, c ;
		
		System.out.print("\t");
		for(c=0; c<3; c++) {
			System.out.print(sub_name[c]+"\t");
			}
		System.out.print("����\t���");
		
		for(r=0; r<5; r++) {
			System.out.print("\n"+name[r]+"\t");
			for(c=0; c<3; c++) {
				System.out.print(score[r][c]+"\t");
				student[r]+=score[r][c];
				subject[c]+=score[r][c];
				
			}
			System.out.print(student[r] + "\t" + student[r]/3);
		}
		
		System.out.println("\n"+"=============================================");
		
		System.out.print("����\t");
		for(int i=0; i<3; i++) {
			System.out.print(subject[i]+"\t");
		}
		
		
		
		
		
	}
}
