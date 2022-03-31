package week5;

public class CharArray {

	public static void main(String[] args) {
		char[] alphabet = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < 26; i++, ch++) {
			alphabet[i] = ch;
			System.out.println(alphabet[i] + " = " + (int)alphabet[i]);
		}
	}
}
