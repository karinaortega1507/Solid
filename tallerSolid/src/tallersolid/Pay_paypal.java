package tallersolid;

/**
 *
 * @author Hp
 */
public class Pay_paypal extends Pay{
    

    public Pay_paypal(String c,Book b) {
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
    public void pay(Pay_paypal pay){
        pay_pal(pay.getType(),pay.book);
    }
}


