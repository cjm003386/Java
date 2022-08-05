package ex08_18_interface_extends;

public class Rectangle implements Transformable {
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//Transformable 인터페이스의 메소드를 구현
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	//Movable 인터페이스의 메소드를 구현
	
	public void moveTo(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void moveBy(int xOffset, int yOffset) {
		this.x += xOffset;
		this.y += yOffset;
	}
	


}
