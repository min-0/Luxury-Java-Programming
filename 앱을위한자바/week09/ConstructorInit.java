package week9;

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){} //기본 생성자
	
	//매개변수가 있는 생성자들
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
		Car c1 = new Car(); //기본 생성자
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		//매개변수가 있을 때
		Car c2 = new Car("White", "auto", 4);
		
		System.out.println("C1의 Color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("C2의 Color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}

}
