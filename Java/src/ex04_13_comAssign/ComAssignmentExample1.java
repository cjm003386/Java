package ex04_13_comAssign;

public class ComAssignmentExample1 {
	public static void main(String agrs[]) {
		
	int res=10, a=2;
	res +=a;   //res = res + a; //12
	System.out.println(res);
	
	res -=a;   //res = res - a; //10
	System.out.println(res);
	
	res *=a;   //res = res * a; //20
	System.out.println(res);
	
	res /=a;   //res = res / a; //10
	System.out.println(res);
	
	int num = 29;
	num-= 2 + 3 * 4;//num = num - (2 + 3 * 4)�� �Ȱ��� ȿ���� ���� ���Թ�
	System.out.println(num);
	
	}
	

}
