//���Ŭ�������� ������ �ں����� ����
package ex07_00_object;

public class Saram_make5 {
    public static void main(String[] args) {
		//Saram5 s = new Saram5("����", 47.7);
    	Saram5 s = new Saram5( 47.7, "����");
		//s.name = "����";
		s.age = 27;
		//s.w = 47.7;
		s.ki = 160;
		s.eat();
		s.walk();
		
		//Saram5 s2 = new Saram5("�ں���", 65);
		Saram5 s2 = new Saram5(65,"�ں���");
		//s2.name = "�ں���";
		s2.age = 23;
		//s2.w = 65;
		s2.ki = 182;
		s2.eat();
		s2.walk();
		
		
	}
}
