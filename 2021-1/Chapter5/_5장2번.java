package ch5;
class TV_{
	private int size;
	public TV_(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV_ extends TV_{
	private int color;
	public ColorTV_(int size, int color) {
		super(size);
		this.color = color;
	}
	public int getColor() {
		return color;
	}
	public void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�");
	}
}

class IPTV_ extends ColorTV_{
	private String ip;
	public IPTV_(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	@Override
	public void printProperty() {
		System.out.println("���� IPTV�� " + ip + "�ּ��� " + getSize() + getColor() + "�÷�");
	}
}
public class _5��2�� {
	public static void main(String[] args) {
		IPTV_ ipTV_ = new IPTV_("192.1.1.2", 32, 2048);
		
		ipTV_.printProperty();
	}

}
