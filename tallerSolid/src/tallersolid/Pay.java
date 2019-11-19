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
    
    private Pay_card pay_card;
    private Pay_cash pay_cash;
    
    
    public void pay(Pay_card pay){
        pay_card(pay.card,pay.book);
    }
    public void pay(Pay_cash pay){
        pay_card(pay.cash,pay.book);
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
