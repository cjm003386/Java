package ex07_07_field;

public class Circle { 
	double radius; //�ʵ�
	
	/*
	 this ��?
	 �ڹٴ� ��ü�� ������ �� �ֵ��� this Ű���带 �����մϴ�.
	 ���������� �ν��Ͻ� �ڽ��� �ּҰ� ����Ǿ� �ֽ��ϴ�.
	 �����ڿ� ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� �����մϴ�.
	 */
	
	Circle(double radius){ //������
		this.radius = radius;
	}
	
	double getArea() { //�޼���
		double area = radius*radius;
		return area;
	}

}
