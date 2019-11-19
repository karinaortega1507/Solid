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
    //private Pay_card pay_card;

    public Pay_card(String c,Book b) {
        super(c,b);
        
    }

    public String getType() {
        return type;
    }

    public Book getBook() {
        return book;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public void pay(Pay_card pay){
        pay_card(pay.getType(),pay.book);
    }
        

	
    
}
