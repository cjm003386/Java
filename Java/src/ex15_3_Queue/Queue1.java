/*
  큐(Queue) 인터페이스
  -LinkedList (Queue 인터페이스를 구현한 클래스)를 사용
  
 */
package ex15_3_Queue;
import java.util.*;
public class Queue1 {
	public static void main(String args[]) {
		//큐로 사용할 LinkedList객체를 생성합니다.
		//LinkedList<String> queue = new LinkedList<Stirng>();
		Queue<String> queue = new LinkedList<String>();
		System.out.println("비었나요? " + queue.isEmpty());//ture-비었는지 판단
		
		//offer()메소드 : 큐에 3개의 데이터를 추가
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		
		//peek() 메소드 : 처음 데이터를 그대로 둔 상태로 가져옵니다.
		System.out.println(queue.peek());
		System.out.println("비었나요? " + queue.isEmpty()); //false-비었는지 판단
		System.out.println("갯수 = " + queue.size());
		
		System.out.println("poll() 사용");
		while(!queue.isEmpty()) {
			//poll()메소드는 큐에 있는 데이터를 제거하면서 가져옵니다.
			String str = queue.poll();
			System.out.println(str);
		}
	
	
	}

}
