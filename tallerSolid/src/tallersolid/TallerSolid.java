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
public class TallerSolid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Pay p = new Pay_card("gg",new Book("title","author","category",2));
        Pay p2 = new Pay_cash("gg",new Book("title","author","category",3));
        p.pay_card("car", new Book("title","author","category",2));
        p2.pay_cash("money", new Book("title","author","category",3));
    }
    
}
