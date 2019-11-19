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
public interface Pay {
    
    public void pay_card(String card, Book book);
		
    public void pay_cash(String money, Book book);
		
    
}
