package ch4;

class song{
	private String title, artist, country;
	private int year;
	
	public song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
}

public class _4��3�� {
	public static void main(String[] args) {
		song sing = new song("Dancing Queen", "ABBA", 1978, "������");
		sing.show();
	}

}
