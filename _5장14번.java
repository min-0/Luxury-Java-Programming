package ch5;

interface Shapes{
	final double PI=3.14;//���
	void draw(); //������ �׸��� �߻� �޼ҵ�
	double getArea(); //������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { //����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circles implements Shapes{ //Shapes�� ��� �޾� �����ϴ� Circles Ŭ����
	private int radius;
	public Circles(int radius) {this.radius=radius;}
	public void draw() {System.out.println("�������� "+radius+"�� �� �Դϴ�.");}
	public double getArea() {return radius*radius*PI;} //���� ���� ũ�� ��ȯ
}

class Ovals implements Shapes{ //Shapes�� ��� �޾� �����ϴ� Ovals Ŭ����
	private int x,y;
	public Ovals(int x,int y) { this.x=x; this.y=y;}
	public double getArea() { return PI*x*y; } //�����ϴ� Ÿ���� ���� ũ�� ��ȯ
	public void draw() {System.out.println(x+"x"+y+"�� �����ϴ� Ÿ���Դϴ�.");}
}

class Rects implements Shapes{ //Shapes�� ��� �޾� �����ϴ� Rects Ŭ����
	private int x,y;
	public Rects(int x,int y) {this.x=x; this.y=y;}
	public double getArea() {return x*y;} //�簢�� ���� ũ�� ��ȯ
	public void draw() {System.out.println(x+"x"+y+"ũ���� �簢�� �Դϴ�.");}
}


public class _5��14�� {
	public static void main(String[] args) {
		Shapes[] list = new Shapes[3]; //Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circles(10); //�������� 10�� �� ��ü
		list[1] = new Ovals(20, 30); //20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rects(10, 40); //10x40 ũ���� �簢��
		
		for(int i=0; i<list.length; i++) list[i].redraw(); //�Ű����� ����
		for(int i=0; i<list.length; i++) System.out.println("������ "+ list[i].getArea());
		//�迭 ũ�⸸ŭ �ݺ��Ͽ� ��ü �迭�� �ִ� ���� ���� ���
	}

}
