//��� Ŭ�������� ������ �ں����� ��������
package ex07_00_object;
public class Saram_make {
    public static void main(String[] args) {
/*
    �ٸ� Ŭ������ �ִ� �ʵ峪 �޼���(���)�� ����Ϸ��� ���� ��ü�� �����ؾ� �մϴ�.
    ������ ��ü ����� �����Ϸ��� ��ħǥ(.)�����ڸ� ����մϴ�.
    ��) ��������.�ʵ�, ��������.�޼���()
*/    	
//    	Ŭ����  ��������   = ������    ������ȣ��
    	Saram  s    =  new   Saram();	
    	s.name="����";
    	s.w=47.4;
    	s.ki=168;
    	s.age=27;
        s.eat();
		
		Saram s2 = new Saram();
		s2.name = "�ں���";
		s2.age = 24;
		s2.w = 65;
		s2.ki = 182;
		s2.eat();
		s2.sesu();
		
	}
}

