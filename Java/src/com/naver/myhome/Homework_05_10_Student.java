package com.naver.myhome;

public class Homework_05_10_Student {
	public static void main(String args[]) {
		String name[] = {"강호동", "이승기", "유재석", "하하", "이광수"};
		String sub_name[] = {"국어", "수학", "영어"};
		int [][]score = { {85, 60, 70}, //0행(1번학생)
				          {90, 95, 80}, //1행(2번학생)
				          {75, 80, 100},//2행(3번학생)
				          { 80, 70, 95},//3행(4번학생)
				          {100, 65, 80}//4행(5번학생)
		                };
		int [] subject = new int[3]; //과목총점 저장
		int [] student = new int[5]; //학생의 총점 저장
		
		System.out.println("==== 학생별 / 과목별 총점 구하기 =====");
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
