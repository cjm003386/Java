package com.naver.myhome;

public class Free {
	public static void main(String args[]) {  String name[] = {"��ȣ��", "�̽±�", "���缮", "����", "�̱���"};

    String sub_name[] = {"����", "����", "����"};

    int[][] score = {

            {85, 60, 70},        //0�� (1���л�)

            {90, 95, 80},        //1�� (1���л�)

            {75, 80, 100},        //2�� (1���л�)

            {80, 70, 95},        //3�� (1���л�)

            {100, 65, 80},        //4�� (1���л�)

    };

    int[] subject = new int[3]; // �������� ����

    int[] student = new int[5]; // �л��� ���� ����

    int[] avg = new int[5]; // �л��� ���

    System.out.println("========== �л��� / ���� �������ϱ� ==========");

    System.out.println ("\t����\t����\t����\t����\t���");
    for (int i = 0; i < score.length; i++) {
        student[i] = score[i][0] + score[i][1] + score[i][2];

        avg[i] = student[i] / 3;
    }

    int i;
    int j;
    int temp;
    String temp1;
    for (i = 0; i < avg.length; i++) {
        for (j = 0; j < avg.length - 1; j++) {
            if (avg[j] < avg[j + 1]) {
                temp = avg[j];
                avg[j] = avg[j + 1];
                avg[j + 1] = temp;

                temp1 = name[j];
                name[j] = name[j + 1];
                name[j + 1] = temp1;

                temp = student[j];
                student[j] = student[j + 1];
                student[j + 1] = temp;

            }
        }
    }
    

		
		
		
		
		
		
	}
}
