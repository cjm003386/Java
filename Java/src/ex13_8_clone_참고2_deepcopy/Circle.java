package ex13_8_clone_참고2_deepcopy;

public class Circle implements Cloneable {
	
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle clone() {
		try {
			Circle c = (Circle)super.clone();
			c.p = new Point(this.p.x, this.p.y);
		}catch(CloneNotSupportedException e) {
			System.out.println("복제 오류 발생했습니다.");
			
		}
		return null;
	
		
	}
	
	public String toString() {
		return "[p=" + p + ",r=" + r + "]";
	}
}
