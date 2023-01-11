package ex07_constructor;

public class Book {
	
	String title;
	String author;
	int price;
	
	Book(String title) {
		this.title = title;
		author = "미상";
	}

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	void info() {
		System.out.print("제목 : " + title + "\t");
		System.out.print("저자 : " + author + "\t");
		System.out.print("가격 : " + price + "원" + "\n");
	}

}
