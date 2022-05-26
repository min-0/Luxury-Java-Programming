package week7;

public class CardMain {
	public static void main(String[] args) {
		//클래스 변수는 객체를 생성하지 않아도 가능
		//클래스이름.클래스 변수
		System.out.println("Card width = " + Card.width);
		System.out.println("Card heigt = " + Card.heigt);
		
		//인스턴스 변수
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		
		System.out.println("변경 전");
		System.out.println("c1은 " + c1.kind + " " + c1.number + ", " +
				"크기는 (" + c1.width + ", " + c1.heigt +")");
		System.out.println("c2는 " + c2.kind + " " + c2.number + ", " +
				"크기는 (" + c2.width + ", " + c2.heigt + ")");
		
		//카드 크기 변경 - c1카드 사용
		c1.width = 100;
		c1.heigt = 200;
		
		System.out.println("변경 후");
		System.out.println("c1은 " + c1.kind + " " + c1.number + ", " +
				"크기는 (" + Card.width + ", " + Card.heigt +")");
		System.out.println("c2는 " + c2.kind + " " + c2.number + ", " +
				"크기는 (" + Card.width + ", " + Card.heigt + ")");
		//클래스 변수는 static 정적변수라서 바꾸면 다 바뀜
		/*클래스 변수를 사용할 땐 인스턴스 변수처럼 사용해도 되지만 헷갈리기 때문에
		 c1.width, c1.height -> Card.width, Card.height 로 변경하는 것이 옳다.
		 */
	}
}

class Card{
	//인스턴스 변수
	String kind;
	int number;
	//클래스 변수
	static int width = 200;
	static int heigt = 400;
}
