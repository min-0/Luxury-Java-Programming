package week13;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Mouse();
		animals[2] = new Chick();
		
		for(int i = 0; i < 3; i++) animals[i].cry();
		
		//Animal animal1 = new Animal();
		//Cat animal2 = new Cat();
		//Mouse animal3 = new Mouse();
		//Chick animal4 = new Chick();
		
		//animal1.cry();
		//animal2.cry();
		//animal3.cry();
		//animal4.cry();
	}
}
