//슈퍼 클래스의 참조 변수값을 캐스트 연산을 이용하여 서브 클래스 참조 변수에 
//대입하는 프로그램
package ex09_05_downcasting;

public class RefTypeExample8 {
	public static void main(String args[]) {
		Account obj1 = 
		 new CheckingAccount("111-22-33333333","홍길동",100000,
								"4444-5555-6666-7777");
		 CheckingAccount obj2 = (CheckingAccount) obj1;
		try {
			int amount = obj2.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj2.cardNo);
			System.out.println("잔액: " + obj2.balance);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
