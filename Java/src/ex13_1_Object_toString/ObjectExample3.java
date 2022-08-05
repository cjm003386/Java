//Object 클래스에 정의된 toString()은 인스턴스에 대한 정보를
//문자열(String)로 제공할 목적으로 정의한 것입니다.


// public String toString(){
//return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}
package ex13_1_Object_toString;

class ObjectExample3 {
	public static void main(String args[]) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(15);
		
		System.out.println(obj1.toString());
		//System.out.print()나 System.out.println()메소드에
		//문자열이 아닌 객체를 넘겨주면 toString()메소드가 호출됩니다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
