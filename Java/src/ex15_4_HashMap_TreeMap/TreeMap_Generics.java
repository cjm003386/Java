//TreeMap
//키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장합니다.
// 검색과 정렬에 적합한 컬렉션 클래스입니다.
package ex15_4_HashMap_TreeMap;

import java.util.*;

public class TreeMap_Generics {
	public static void main(String args[]) {
		//HashMap 객체 생성 방법 두 가지
		//Map hm = new HashMap(); 	//방법 1. 업캐스팅
		TreeMap<String, String> tm = new TreeMap<String, String>(); //방법2. 구현 클래스를 통한 객체 생성
		
		//Key와 value 쌍을 삽입
		//Map의 put()을 이용해 (Key, Value) 쌍으로 자료 저장합니다.
		tm.put("woman", "재미있니");
		tm.put("man", "좋은하루");
		tm.put("age", new String("10"));
		tm.put("city", "Seoul");
		tm.put("city",("Busan"));
		
		
		System.out.println(tm);
		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		
		//출력방법 2. Key 값만 출력
		System.out.println( tm.keySet()); // [woman, city, man, age]
		
		//출력방법 3. value 값만 출력
		System.out.println(tm.values());
		
		//출력방법 4.
		//get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println( tm.get("women")); //재미있니
		System.out.println( tm.get("city")); //Busan
		
		//출력방법 5.
		System.out.println("=====================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}

}
