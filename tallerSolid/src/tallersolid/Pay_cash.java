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
public class Pay_cash extends Pay{
    //private Pay_cash pay_cash;

    public Pay_cash(String c,Book b) {
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

    public void pay(Pay_cash pay){
        pay_card(pay.getType(),pay.book);
    }

    
    
    
    
    
}
