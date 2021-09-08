package ch3_;

public class _3Àå2¹ø {

	public static void main(String[] args) {
		int n [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		for(int i = 0; i<n.length; i++) {
			for (int k = 0; k < n[i].length; k++) {
				System.out.print(n[i][k] + " ");
			}
			System.out.println();
		}
	}

}
