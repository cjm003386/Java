package com.naver.myhome;

public class Homework_05_10_Student {
	public static void main(String args[]) {
		String name[] = {"��ȣ��", "�̽±�", "���缮", "����", "�̱���"};
		String sub_name[] = {"����", "����", "����"};
		int [][]score = { {85, 60, 70}, //0��(1���л�)
				          {90, 95, 80}, //1��(2���л�)
				          {75, 80, 100},//2��(3���л�)
				          { 80, 70, 95},//3��(4���л�)
				          {100, 65, 80}//4��(5���л�)
		                };
		int [] subject = new int[3]; //�������� ����
		int [] student = new int[5]; //�л��� ���� ����
		
		System.out.println("==== �л��� / ���� ���� ���ϱ� =====");
		for (int i = 0; i < sub_name.length; i++) {
			System.out.print("\t" + sub_name[i]);
		}

		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

			}
			System.out.println();
		}

	}

}
