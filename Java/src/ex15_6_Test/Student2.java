package ex15_6_Test;

import java.util.ArrayList;

public class Student2 {
	String name;
	int kor;
	int math;
	int eng;
	static int korTotal;
	static int mathTotal;
	static int engTotal;

	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;		
		this.eng = eng;
		this.math = math;
		korTotal+=kor;
		engTotal+=eng;
		mathTotal+=math;
	}
	int getTotal() {
		return kor+eng+math;	
	}
	
	float getAverage(){ 
	   	 return (getTotal() / 3f);
	}
	
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math
				+ "\t" + getTotal() + "\t" + String.format("%.1f", getAverage());
				

	}



//�����ϱ�
static void sort (ArrayList<Student2> as) {
	for (int i = 0; i < as.size() - 1; i++) {
		for(int j = i + 1; j < as.size(); j++) {
			if(as.get(i).getTotal() < as.get(j).getTotal()) {
				
				Student2 imsj = as.get(i);
				as.set(j, as.get(i));
				as.set(i, imsj);
			}
		}
	}
}

	
}