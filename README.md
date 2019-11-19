# Práctica SOLID
Dado el siguiente código considere el caso en el que se desea agregar otro método de pago como PayPal. Identifique los principios SOLID que se está violando, explique la razón y corrija el código de tal forma que ya no se viole ningún principio. Usted puede crear las interfaces y clases que considere o cambiar nombres de métodos si necesario.  

import java.util.ArrayList;

public class Book {
	
	String title;
	String author;
	String category;
	float price;
	boolean state;
	
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
	void searchBook() {
		/*
		 * Search a book for author or title or category
		 */
	}

}

class StoreBook {

	private ArrayList<Book> books;
	private Book book;
	
	
	public StoreBook() {
		/** 
		 * Initialize array with books
		 */
	}
	
	public void pay(String method, Book book) {
		if(method == "card") {
			pay_card("numberCard", book);
		}else if ( method == "cash") {
			pay_cash( "money", book);
		}
	}
	
	public void pay_card(String card, Book book) {
		/*
		 * change state to true
		 */
	}
	
	public void pay_cash(String money, Book book) {
		/*
		 * change state to true
		 */
	}
	
	public void removeBooksPurchased(ArrayList<Book> books) {
		/*
		 * store books with state true in new array and remove the original array
		 * 
		 */
	}
	

}



#     Correciones  
* Se identifica que el principio SRP no se cumple ya que hay dependencia entre las clases y si los requisitos cambian con el tiempo cada uno de los métodos también cambiarán la responsabilidad de al menos una clase(lo que sucede ahora al querer implementar la forma de pago PayPal).
* Se identifica que el principio OCP no se cumple puesto que las clases están abiertas a modificaciones para corregir se implementó la clase Pay como clase Padre y clases hijas Pay_Card, Pay_Cash, Pay_Pal además de la interface SearchBook. las clases estan cerradas a modificaciones pero abiertas para extenderse pudiendo agregar nuevos comportamientos sin modifcar el código actual.
* El principio LSP  extendiende del principio OCP ya que se centra en el comportamiento de superclases y subtipos como sucede con la clase Padre Pay y la clase StoreBook que implementa SearchBook.
* Para cumplir el principio DIP los comportamientos de las clases hijas de Pay o de la interfaz SearchBook pueden ser reutilizados por otras clases según la necesidad que se presente a futuro sin que se vean afectados por los cambios en los módulos de bajo nivel, que proporcionan funciones de utilidad. 
