//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ����α׷�
package ex08_14_02_interface;

public class InterFaceExample2 {
	public static void main(String args[]) {
		SeparateVolume obj1
		= new SeparateVolume("836��774��", "����", "��������");
		obj1.checkOut("ȫ�浿", "2021-10-25");
		obj1.checkIn();
		
		APPCDInfo obj2
		= new APPCDInfo("2005-7001","Redhat Fedora");
		obj2.checkOut("ȫ�浿", "2021-10-25");
		obj2.checkIn();
	}

}
