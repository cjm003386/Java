package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest1_contains2 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("봄");
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("봄");		//0  	제거
		list2.add("봄");		//1		0
		list2.add("가을");	//2		1
		list2.add("겨울");	//3		2
		
//		list2.remove(0);
//		list2.remove(0);
		
		
		//list2에서 list1과 공통되는 요소들을 찾아 삭제
		for(int i=0; i<list2.size(); i--) {
			//지정된 객체(list2.get(i))가 list1에 포함되어있는지 확인
			if(list1.contains(list2.get(i)))
				list2.remove(i--);
		
//		//뒤에서부터 검사하여 삭제하기
//		for(int i=list2.size()-1; i>=0; i--) {
//			//지정된 객체(list2.get(i))가 list1에 포함되어있는지 확인
//			if(list1.contains(list2.get(i)))
//				list2.remove(i);
		}
		
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
	}

}
