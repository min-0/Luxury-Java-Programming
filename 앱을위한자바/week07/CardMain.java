package week7;

public class CardMain {
	public static void main(String[] args) {
		//Ŭ���� ������ ��ü�� �������� �ʾƵ� ����
		//Ŭ�����̸�.Ŭ���� ����
		System.out.println("Card width = " + Card.width);
		System.out.println("Card heigt = " + Card.heigt);
		
		//�ν��Ͻ� ����
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		
		System.out.println("���� ��");
		System.out.println("c1�� " + c1.kind + " " + c1.number + ", " +
				"ũ��� (" + c1.width + ", " + c1.heigt +")");
		System.out.println("c2�� " + c2.kind + " " + c2.number + ", " +
				"ũ��� (" + c2.width + ", " + c2.heigt + ")");
		
		//ī�� ũ�� ���� - c1ī�� ���
		c1.width = 100;
		c1.heigt = 200;
		
		System.out.println("���� ��");
		System.out.println("c1�� " + c1.kind + " " + c1.number + ", " +
				"ũ��� (" + Card.width + ", " + Card.heigt +")");
		System.out.println("c2�� " + c2.kind + " " + c2.number + ", " +
				"ũ��� (" + Card.width + ", " + Card.heigt + ")");
		//Ŭ���� ������ static ���������� �ٲٸ� �� �ٲ�
		/*Ŭ���� ������ ����� �� �ν��Ͻ� ����ó�� ����ص� ������ �򰥸��� ������
		 c1.width, c1.height -> Card.width, Card.height �� �����ϴ� ���� �Ǵ�.
		 */
	}
}

class Card{
	//�ν��Ͻ� ����
	String kind;
	int number;
	//Ŭ���� ����
	static int width = 200;
	static int heigt = 400;
}
