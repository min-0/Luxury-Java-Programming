package week11;

class Point2D {
	int x, y;
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}

class Point3D extends Point2D {
	int z;
	Point3D(int x, int y, int z) {
		super(x, y); //부모 클래스에 있는 생성자 x, y를 쓰겠다.
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}
	
}
public class ConstructorTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(10, 20, 30);
		System.out.println(p3);
	}

}
