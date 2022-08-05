//clone()메소드는 객체를 복제하는 기능을 합니다.
//즉, 똑같은 값을 갖는 객체를 한 개 더 만듭니다.
//복제 가능한 클래스에 대해서만 호출할 수 있습니다.


package ex13_8_clone_0;

;

class ObjectExample2 {
	public static void main(String args[]) {
		//객체를 생성합니다.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone 메서드로 객체를 복제합니다.
		Rectangle obj2 = (Rectangle) obj1.clone(); 
		//Rectangle 클래스에서 implements Cloneable 하지 않아 에러 발생
		
		//원본 객체와 복제 객체의 값을 출력합니다.
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
		
		obj1.height = 100; obj1.width=200;
		System.out.println("[obj1] " + obj1);
		System.out.println("[obj2] " + obj2);
	}
	

}
