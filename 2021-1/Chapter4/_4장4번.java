package ch4;

import java.util.*;
class Rectangle{ //Rectangle Ŭ���� ����
	private int x, y, width, height; //�ʿ��� Ŭ���� �ʵ� ����
	
	public Rectangle(int x, int y, int width, int height){ //Ŭ���� �̸��� ������ ������ ����
		// ���� �̸��� ���⵵ �ϰ� ���� Ŭ���� �� �ٸ� ������ ȣ���� ���� this�� ������ش�.
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int square() { //�簢�� ���̸� �����ִ� ��
		return width*height;
	}
	public void show() { //��ǥ�� ���̸� ������ִ� ��
		System.out.println("(" + x+", "+  y+ ")���� ũ�Ⱑ "+width+"X" +height+ "�� �簢��");
	}
	public boolean contains(Rectangle r) { // �簢���� �Ű����� r�� �����ϴ� �� ���θ� �Ǵ��� ��
		if(x + width >r.x + r.width && r.y + r.height < y + height) {
			return true;
		}
		else
			return false;
	}
}
public class _4��4�� { 
	public static void main(String[] args) {
		//r, s, t�� Rectangle ��ü ����
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();// show() ȣ��
		System.out.println("s�� ������ " + s.square()); // square() ȣ�� �� ���
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�."); //contains(r) ȣ�� �� True�� ��ȯ�� �� ���
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�."); // contains(s) ȣ�� �� True�� ��ȯ�� �� ���
	}

}
