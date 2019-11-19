/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersolid;

/**
 *
 * @author CltControl
 */
public class Pay {
    
    protected String type;
    protected Book book;

    public Pay(String type, Book book) {
        this.type = type;
        this.book = book;
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

		
    
}
