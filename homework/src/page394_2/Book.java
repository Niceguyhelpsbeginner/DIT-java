package page394_2;

public class Book {
	String writer;
	String title;
	String perchaser;
	Book(String writer, String title, String perchaser){
		this.writer = writer;
		this.title = title;
		this.perchaser = perchaser;
		
	}
	public String toString() {
		return perchaser + " had perchased " + title + "thats written by" + "writer";
	}
	public boolean equals(Book compa) {
		if(title.equals(compa.title)) {
			return true;
		}
		else {
			return false;
		}
	}
}
