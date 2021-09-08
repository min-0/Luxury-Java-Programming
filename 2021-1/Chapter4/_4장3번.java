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
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class _4장3번 {
	public static void main(String[] args) {
		song sing = new song("Dancing Queen", "ABBA", 1978, "스웨덴");
		sing.show();
	}

}
