package week5;

import java.util.Random;

public class DotArt {

	public static void main(String[] args) {
		int size = 40;
		boolean[][] canvas = new boolean[size][size];
		Random random = new Random();
		
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++) {
				canvas[i][k] = random.nextBoolean();
			}
		}
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++) {
				System.out.print(canvas[i][k] == true ? "*" : " ");
			}
			System.out.println();
		}

	}

}
