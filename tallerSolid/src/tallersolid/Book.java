package tallersolid;


public class Book {
	
	protected String title;
	protected String author;
	protected String category;
	protected float price;
	protected boolean state;
	
	public Book(String title, String author, String category,float price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		state = false;
		
	}

	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	/*void searchBook() {
		/*
		 * Search a book for author or title or category
		 
	}
        public void pay_card(String card, Book book) {
		/*
		 * change state to true
		 
	}
	
	public void pay_cash(String money, Book book) {
		/*
		 * change state to true
		 
	}*/

}
