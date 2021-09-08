package ch3_;

public class _3Àå9¹ø {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		for (int i = 0; i<4; i++) {
			for (int k = 0; k<4;k++) {
				array[i][k] = (int)(Math.random()*10+1);
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
