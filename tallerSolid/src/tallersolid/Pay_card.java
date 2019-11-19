/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersolid;

/**
 *
 * @author Hp
 */
public class Pay_card extends Pay{
    String card;
    Book book;
    
     public Pay_card(String card, Book book) {
        this.card = card;
        this.book = book;
    }
     
    public String getCard() {
        return card;
    }

    public Book getBook() {
        return book;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setBook(Book book) {
        this.book = book;
    }

   
        

	
    
}
