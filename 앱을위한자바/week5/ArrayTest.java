package week5;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 80, 90};
		//float everage = 0.0f;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
			sum += scores[i];
		}
		System.out.println("ÃÑÁ¡ = " + sum);
		System.out.println("Æò±Õ = " + (float)(sum/5));
		//System.out.println("Æò±Õ = " + everage);
	}
}
