package D;

class ShoppingMall{
    private DebitCard dc;

    public ShoppingMall(DebitCard dc){
        this.dc=dc;
    }

    public void doPurchase(long amount){
        dc.doTransaction(amount);
    }
}

class CreditCard{
    public void doTransaction(long amount){
        System.out.println("Successfully paid "+amount);

    }
}

class DebitCard{
    public void doTransaction(long amount){
      System.out.println("Successfully paid "+amount);
    }
}

public class Dip {
    //dip=dependency Inversion principle
    //the principle states that we must use abstraction (abstract class and interface) instead of concrete
    //implementations. High level module should not depend on low level module

    public static void main(String args[]){
        DebitCard dc = new DebitCard();
        ShoppingMall mall = new ShoppingMall(dc);
        mall.doPurchase(500);
        //As here class mall is tightly coupled with the class debitcard and creditcard
        //we should avoid this

    }
}
