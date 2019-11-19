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
    String cash;
    Book book;

    public Pay_cash(String cash, Book book) {
        this.cash = cash;
        this.book = book;
    }
    
    
    public String getCash() {
        return cash;
    }

    public Book getBook() {
        return book;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
}
