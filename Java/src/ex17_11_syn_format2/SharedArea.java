//공유 영역 클래스
package ex17_11_syn_format2;

public class SharedArea {
	private Account account1; // 이몽룡의 계좌
	private Account account2; // 성춘향의 계좌
	
	SharedArea(Account account1, Account account2){
		this.account1 = account1;
		this.account2 = account2;
		}
	//클래스안에서 마우스 우클릭 -> Source
	//-> Generate Getters and Setters로 만들 수 있습니다.
	
	
	//동기화 메소드
		synchronized void transfer() { 
			account1.withdraw(1000000);
			account2.deposit(1000000);
		} 
	
	//동기화 메소드
	synchronized int getTotal() { // 잔액 합계를 구한다.
		synchronized (this) {
			return account1.getBalance() + account2.getBalance();
		} 
	}

	
	
	

}
