/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersolid;

import java.util.ArrayList;

class StoreBook implements Pay,SearchBook{

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
	
		
	public void removeBooksPurchased(ArrayList<Book> books) {
                searchBook();
		/*
		 * store books with state true in new array and remove the original array
		 * 
		 */
	}

        @Override
    public void pay_card(String card, Book book) {
		/*
		 * change state to true
		 */
	}
	
        @Override
	public void pay_cash(String money, Book book) {
		/*
		 * change state to true
		 */
	}

    @Override
    public void searchBook() {
		/*
		 * Search a book for author or title or category
		 */
	}
}

