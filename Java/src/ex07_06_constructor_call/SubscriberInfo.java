//�����ڿ��� �����ڸ� ȣ���ϴ� ��
package ex07_06_constructor_call;

public class SubscriberInfo {
 String name, id, password, phoneNo, address;
 SubscriberInfo() {
	 }
 
	
	//this�� �������� �ν��Ͻ� �ڽ��� ����ŵ�ϴ�.
	SubscriberInfo(String name, String id, String password ){
		this.name = name;
		this.id = id;
		this.password = password;
	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
	//this( ) : �����ڷ� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����մϴ�.
	//������ ȣ�⹮�� ������ �ȿ��� ù��° ��ɹ��̾�� �մϴ�.
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


