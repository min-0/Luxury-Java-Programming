package week4;

public class LoopContinueBreak {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println("현재는 " + i + "번째 입니다.");
			if(i <= 5) break;
			//continue;
			//System.out.println("현재는 " + i + "번째 입니다. --> continue  아래입니다."); //continue 때문에 도달하지 않음. 건너뜀
		}

	}

}
