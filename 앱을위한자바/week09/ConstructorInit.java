package week9;

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){} //�⺻ ������
	
	//�Ű������� �ִ� �����ڵ�
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
		this.door = 4;
	}
}

public class ConstructorInit {
	public static void main(String[] args) {
		Car c1 = new Car(); //�⺻ ������
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		//�Ű������� ���� ��
		Car c2 = new Car("White", "auto", 4);
		
		System.out.println("C1�� Color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("C2�� Color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}

}
