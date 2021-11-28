package D;

interface BankCard{
    public void doTransaction(long amount);
}

class DC implements BankCard{

    @Override
    public void doTransaction(long amount) {
    System.out.println("Successfully paid "+amount);
    }
}
class CC implements BankCard{

    @Override
    public void doTransaction(long amount) {
        System.out.println("Successfully paid"+amount);

    }
}

class Mall{
    private BankCard bc;

    public Mall(BankCard bc){
        this.bc=bc;
    }

    public void doPurchase(long amount){
        bc.doTransaction(amount);
    }

}

public class DipValid {
    public static void main(String args[]){
        BankCard bc = new DC();

        BankCard bcn = new CC();
        //Now the classes are not tightly coupled we just have to create the object of that class using runitme
        //polymorphism

        Mall mall = new Mall(bc);
         mall.doPurchase(500);
    }

}
