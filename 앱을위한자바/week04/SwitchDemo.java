package week4;

public class SwitchDemo {

	public static void main(String[] args) {
		int value = 3;
		
		switch(value) {
		case 3:
		case 4:
		case 5:
			System.out.println(value + "���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(value + "���� �����Դϴ�.");
			break;
		} //switch
		System.out.println("switch�� �ٱ��Դϴ�. ������ ����");
	}
}