package com.naver.myhome;

public class 과제_05_11 {
	public static void main(String args[]) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };
		int[][] score = { 
				{ 85, 60, 70 }, // 0행("강호동")
				{ 90, 95, 80 }, // 1행("이승기")
				{ 75, 80, 100 }, // 2행("유재석")
				{ 80, 70, 95 }, // 3행("하하")
				{ 100, 65, 80 } // 4행("이광수")
		};
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		
		System.out.println("========= 학생별  /  과목별 총점 구하기 =========");
		
		int r, c ;
		
		System.out.print("\t");
		for(c=0; c<3; c++) {
			System.out.print(sub_name[c]+"\t");
			}
		System.out.print("총점\t평균");
		
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
		
		System.out.print("총점\t");
		for(int i=0; i<3; i++) {
			System.out.print(subject[i]+"\t");
		}
		
		
		
		
		
	}
}
