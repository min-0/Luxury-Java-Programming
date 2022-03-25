package week4;

public class BirthdayMessage {

	public static void main(String[] args) {
		int age = 20;
		
		System.out.println("Happy Birthday! Park.\n");
		
		for(int i = 0; i < age + 2; i++) {
			if(i == 0 || i == age + 1) System.out.print(" ");
			System.out.print("'");
		}
		System.out.println();
		for(int i = 0; i <= age + 2; i++) {
			if(i == 0 || i == age + 1) System.out.print(" ");
			System.out.print("|");
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < age+2; k++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("\nYou are already" + age + "years old!");
	}

}
