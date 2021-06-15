package ch5;

interface PhoneInterface_{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface_ extends PhoneInterface_{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int caculate(int x, int y) {return x + y;}
}

class SmartPhone extends PDA implements MobilePhoneInterface_, MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}
	@Override
	public void sendSMS() {
		System.out.println("���� ���ϴ�.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��.");
	}
	
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	
	public void shedule() {
		System.out.println("���� �����մϴ�.");
	}
}
public class EX5_9 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ� " + phone.caculate(3,  5));
		phone.shedule();
	}

}
