package ch4;
class TV {
	private String name;
	private int year;
	private int inch;
	
	void show() {
		System.out.println(name + "���� ���� " + year + "�� " + inch + "��ġ");
	}
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
		
	}
	
}
public class _4��1�� {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
