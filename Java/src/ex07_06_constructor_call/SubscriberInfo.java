//생성자에서 생성자를 호출하는 예
package ex07_06_constructor_call;

public class SubscriberInfo {
 String name, id, password, phoneNo, address;
 SubscriberInfo() {
	 }
 
	
	//this는 참조변수 인스턴스 자신을 가리킵니다.
	SubscriberInfo(String name, String id, String password ){
		this.name = name;
		this.id = id;
		this.password = password;
	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
	//this( ) : 생성자로 같은 클래스의 다른 생성자를 호출할 때 사용합니다.
	//생성자 호출문은 생성자 안에서 첫번째 명령문이어야 합니다.
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void changePassword(String password) {
		this.password = password;
	}
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	void setAddress(String address) {
		this.address = address;
	}
}


