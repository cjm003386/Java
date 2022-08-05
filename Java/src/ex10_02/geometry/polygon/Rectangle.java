package ex10_02.geometry.polygon;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}


