package I;

interface UPI{
    public void payMoney();

    public void getScratchCard();

}

interface CashBack{

    public void getCashBackAsCredit();
}


class PaytM implements UPI{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}

class Gpay implements UPI,CashBack{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCredit() {

    }
}


public class IspValid {
    //To overcome the exceptions we have to create two different interfaces.
    //
}
