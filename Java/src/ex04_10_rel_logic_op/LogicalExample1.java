//논리 연산자
package ex04_10_rel_logic_op;

public class LogicalExample1 {
	public static void main(String[] args) {
		boolean a = 4 > 3;
		boolean b = 5 > 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (a && b) {//둘다 참
			System.out.println("a&&b가 참");
			}
		
	    if(a||b) {// 둘 중 하나만 참
		System.out.println("a||가 참");
	}
}

}
