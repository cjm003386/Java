package com.naver.myhome;

public class �������迭_�л���_����_�������_���� {
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
		System.out.println();
		for (int i = 0; i <= 50; i++)
			System.out.print("*");

		for (int i = 0; i < student.length - 1; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if (student[i] > student[j]) {
					int imsi = student[i];
					student[i] = student[j];
					student[j] = imsi;

					int imsi2[] = score[i];
					score[i] = score[j];
					score[j] = imsi2;

					String imsi3 = name[i];
					name[i] = name[j];
					name[j] = imsi3;
				} // if
			} // for j
		} // for i

		System.out.println();
		System.out.println("========= �л���  /  ���� ���� ���ϱ� =========");

		System.out.print("\t");
		for (c = 0; c < 3; c++) {
			System.out.print(sub_name[c] + "\t");
		}
		System.out.print("����\t���");

		for (r = 0; r < 5; r++) {
			System.out.print("\n" + name[r] + "\t");
			for (c = 0; c < 3; c++) {
				System.out.print(score[r][c] + "\t");

			}
			System.out.print(student[r] + "\t" + student[r] / 3);

		}
		System.out.print("\n" + "=============================================");
		System.out.print("\n" + "����" + "\t");
		for (c = 0; c < subject.length; c++)
			System.out.print(subject[c] + "\t");
	}
}
