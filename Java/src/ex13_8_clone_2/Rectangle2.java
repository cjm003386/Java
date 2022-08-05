package ex13_8_clone_2;

public class Rectangle2 {
	int width, height;
	
	/*공변 반환 타입(covariant return type) - JDK1.5부터 적용
	 * 오버라이딩할 때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을
	 * 허용하는 것입니다.
	 * 즉, 반환형을 Object에서 자손 클래스 타입으로 변경을 허용합니다.
	 * 
	 * 좋은점 : clone()호출 후 형 변환이 필요없습니다.(main 메서드)
	 * Rectangle obj2 = (Rectangle) obj1.clone();
	 * ==> Rectangle obj2 = obj1.clone();
	 * */
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2 clone() {
		try {
			//슈퍼 클래스의 clone메소드를 호출해서 그 결과를 리턴합니다.
			return (Rectangle2) super.clone();
		}
		//슈퍼 클래스의 clone메소드가 발생하는 익셉션을 처리
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		return "width=" + width + ", height=" + height;
	}

}
