package oop;


class Song {
	String title;
	String artist;
	int released_year;
	String lang;
	Song(String title, String artist, int released_year, String lang){
		this.title = title;
		this.artist = artist;
		this.released_year = released_year;
		this.lang = lang;
	}
	void show() {
		System.out.println(released_year + "년" + lang + "의 "+artist + "가 부른 "+title);
	}
}


public class practicalPage247_5quiz {

	public static void main(String[] args) {
		Song tree = new Song("가로수 그늘 아래 서면","이문세",1988, "한국");
		tree.show();
	}
}
