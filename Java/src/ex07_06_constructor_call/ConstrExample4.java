package ex07_06_constructor_call;

public class ConstrExample4 {
	
   public static void main(String args[]) {
			SubscriberInfo obj = new SubscriberInfo("���ӽ� ����", "java","java","010-1111-2222","���� ã��������~");
			
			printSubscriberInfo(obj);
			
		//�ּ� ����
			obj.setAddress("����� ������ ���ﵿ");
			printSubscriberInfo(obj);
			
		}

		static void printSubscriberInfo(SubscriberInfo obj) {
			System.out.println("�̸�:" + obj.name);
			System.out.println("���̵�" + obj.id);
			System.out.println("�н�����:" + obj.password);
			System.out.println("��ȭ��ȣ:" + obj.phoneNo);
			System.out.println("�ּ�:" + obj.address);
			System.out.println("=======================");
			
		}

	}



