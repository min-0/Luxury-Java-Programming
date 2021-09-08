package ch5;

import java.util.*;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;} //��ũ ����
	public Shape getNext(){return next;}
	public abstract void draw(); //�߻� �޼ҵ�
}

class Line extends Shape{ //Shape�� ��� �޴� Line Ŭ����
	@Override //�Լ� ������
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{ //Shape�� ��� �޴� Rect Ŭ����
	@Override //�Լ� ������
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{ //Shape�� ��� �޴� Circle Ŭ����
	@Override //�Լ� ������
	public void draw() {System.out.println("Circle");}
	
}

class GrahpicEditor{ //GraphicEditor Ŭ���� ����
	static Scanner sc =new Scanner(System.in);
	private Shape one = null, two = null; //������ ��ġ ù��°�� one, �ι�°�� two�� ����
	public void run() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		int n; //������ ��ɾ� 
		int option; //���� �ɼ� ���� ��ɾ�
		int index; // ���� ��ġ
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			n = sc.nextInt();
			while(true) {
				if(n == 1) { //���Խ� 
					System.out.print("Line(1), Rect(2), Circle(3)>>"); 
					option = sc.nextInt(); 
					if (option < 1 || option > 3) { //���� ó��
						System.out.println("�߸��� ��ɾ� �Դϴ�.");
						break; 
					}
					insert(option); //���� �޼ҵ� ȣ��
					break;
				}
				else if(n == 2) { // ���� ��
					System.out.print("������ ������ ��ġ >> ");
					index = sc.nextInt();
					if(!delete(index)) {System.out.println("������ �� �����ϴ�.");}
					//������ �� ���� ������ �� ���
					break;
				}
				else if(n == 3) { //��� ���� ��
					show(); //���� �޼ҵ� ȣ��
					break;
				}
				else if(n == 4) { //���� ��
					System.out.println("beauty�� �����մϴ�.");
					return; //�Լ� ����
				}
			}
		}
	}
	public void insert(int option) { //���� �޼ҵ�
		Shape shape = null;
		switch (option) {
			case 1: //�� �ɼ� ���� ��
				shape = new Line(); 
				break; 
			case 2: //�簢�� �ɼ� ���� �� 
				shape = new Rect();
				break;
			case 3: //�� �ɼ� ���� ��
				shape = new Circle();
				break;
		}
		if (one == null) {one = shape; two = shape;}
		//����Ʈ�� ����� ��
		else {two.setNext(shape); two = shape;}
		//�̹� ������ �� ������ ���� �ڿ� ����
	}
	private boolean delete(int index) { //���� �޼ҵ�
		Shape current = one, previous = one; //���� �ʱ�ȭ ����
		if (one == null)// ����Ʈ�� ����� ��
			return false; //false ��ȯ
		for (int i=0; i<index; i++) {
			previous = current;
			current = current.getNext(); //���� ���ҷ� �̵�
			if (current == null) //�ε����� ����Ʈ���� ū ���
				return false;
		}
		if (one == two) {//���Ұ� �� ���� ��
			one = two = null;
			return true;
		}
		if (current == one) {//ù��° �ε��� �����ϴ� ��� 
			one = one.getNext(); //���� ���Ұ� ù��°
		}
		else if (current == two) {//������ ���Ҹ� �����ϴ� ��� 
			two = previous; //���� ���Ұ� ������ ����
			two.setNext(null);
		} 
		else {
			previous.setNext(current.getNext()); //���� ���� ����
		}
		return true; 
	
	}
	public void show() { //��� ���� �޼ҵ�
		Shape shape = one;
		while(shape != null) { //����Ʈ�� ���� �ʾ��� ��
			shape.draw();
			shape = shape.getNext();
		}
	}	
}

public class _5��12�� {
	public static void main(String[] args) {
		GrahpicEditor Ed = new GrahpicEditor(); //Ŭ���� ��ü ����
		Ed.run(); //������ �Լ� ȣ��
	}
}
