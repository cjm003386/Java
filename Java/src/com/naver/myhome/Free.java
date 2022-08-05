package com.naver.myhome;

public class Free {
	public static void main(String args[]) {  String name[] = {"강호동", "이승기", "유재석", "하하", "이광수"};

    String sub_name[] = {"국어", "수학", "영어"};

    int[][] score = {

            {85, 60, 70},        //0행 (1번학생)

            {90, 95, 80},        //1행 (1번학생)

            {75, 80, 100},        //2행 (1번학생)

            {80, 70, 95},        //3행 (1번학생)

            {100, 65, 80},        //4행 (1번학생)

    };

    int[] subject = new int[3]; // 과목총점 저장

    int[] student = new int[5]; // 학생의 총점 저장

    int[] avg = new int[5]; // 학생의 평균

    System.out.println("========== 학생별 / 과목별 총점구하기 ==========");

    System.out.println ("\t국어\t수학\t영어\t총점\t평균");
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
