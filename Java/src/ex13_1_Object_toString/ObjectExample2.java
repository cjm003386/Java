//Object 클래스에 정의된 toString()은 인스턴스에 대한 정보를
//문자열(String)로 제공할 목적으로 정의한 것입니다.
//클래스 작성할 때 toString()을 오버라이딩 하지 않으면 아래와 같이
//정의된 내용이 그대로 사용될 것입니다.

// public String toString(){
//return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}
package ex13_1_Object_toString;

class ObjectExample2 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1.toString());
		//System.out.print()나 System.out.println()메소드에
		//문자열이 아닌 객체를 넘겨주면 toString()메소드가 호출됩니다.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
