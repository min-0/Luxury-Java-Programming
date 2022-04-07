package week4;

public class SwitchDemo {

	public static void main(String[] args) {
		int value = 3;
		
		switch(value) {
		case 3:
		case 4:
		case 5:
			System.out.println(value + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(value + "월은 여름입니다.");
			break;
		} //switch
		System.out.println("switch문 바깥입니다. 무조건 실행");
	}
}