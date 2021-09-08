class Point {
    private int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

// 상속시키자
class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super();
        color = "BLACK";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color;

    }
}

public class _5장6번 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println("지금 만든 아이의 컬러는 " + zeroPoint.toString());
        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println("새로 만든 아이의 컬러는 " + cp.toString());
    }
}