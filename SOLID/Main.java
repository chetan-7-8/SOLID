package SOLID;

import java.util.List;



//Single Responsibility
//The class LoanCalculator only implements the calculating loan functionality
interface ILoanCalculator{
    public double calculateLoan();
}

class LoanCalculator implements ILoanCalculator{

    @Override
    public double calculateLoan() {
        return 1000;
    }
}



//OPEN-CLOSED
//if we want some accounts to get approved then e just have to implement the IloanAccount interface.
//We do not need to modify that interface which follows open and close principle we just have to implement it.
interface ILoanAccount{
    boolean processApplication();
}

class ChetanAccount implements ILoanAccount{

    @Override
    public boolean processApplication() {
        //calculate if person has successful application
        //put the logic for approval here
        if(1>2){
            return true;
        }
        else{
            return false;
        }
    }
}

class ZemosoAccount implements ILoanAccount{

    @Override

    //calculate if person has successful application
    public boolean processApplication() {

        if(2<3){
            return true;
        }
        else
            return false;
    }
}



//Liskov Substitution
//Suppose we allow two type of users child and adult user and we only give functionality of withdrawal to the
// adult user. So if we will implement the interface with both the class child and adult it will violate the
//lsp principle so we have to create two different class one is BankAccountWithWithdraw and other is
// BankAccountWithoutWithdraw now we can simply extend the class with respective class.

interface IbankAccount{
    boolean withdraw(double amt);
}

class BankAccountWithWithdraw implements IbankAccount{

    @Override
    public boolean withdraw(double amt) {
        //implementation
        return true;
    }
}

class BankAccountWithoutWithdraw implements IbankAccount {

    @Override
    public boolean withdraw(double amt) {
        return false;
    }
}

class ChildAccount extends BankAccountWithoutWithdraw{
//No withdrawl allowed
}

class AdultAccount extends BankAccountWithWithdraw{
    //Withdraw Allowed
}




//Interface Segregation
//Payment interface hold the details of payment like the loan details and the payment done by users So if we
// implement all the functionality within a single interface then the loan user will have the implement the
// unnecessary methods to avoid this I have created two different interfaces for Bankpayment and Loan,
interface Payment{
    IbankAccount status();
    List<IbankAccount> getPayment();
}

interface BankP{
    void initiatePayments();
}

interface Loan{
    void initiateLoanSettlment();
    void initiateRepayment();
}

class BankPayment implements Payment,BankP{

    @Override
    public IbankAccount status() {
        return null;
    }

    @Override
    public List<IbankAccount> getPayment() {
        return null;
    }

    @Override
    public void initiatePayments() {

    }
}

class LoanPayment implements Payment,Loan{

    @Override
    public IbankAccount status() {
        return null;
    }

    @Override
    public List<IbankAccount> getPayment() {
        return null;
    }

    @Override
    public void initiateLoanSettlment() {

    }

    @Override
    public void initiateRepayment() {

    }
}

//Dependency Inversion
//Now to make payment you can choose either of card Credit or Debit. We dont have to depend on the objects
// of DebitCard or CreditCard. I have created a different interface BankCard which deals with the Debit and Credit card.

interface BankCard{
    public void doTransaction(long amt);
}

class DebitCard implements BankCard{

    @Override
    public void doTransaction(long amt) {

    }
}

class CreditCard implements BankCard{

    @Override
    public void doTransaction(long amt) {

    }
}



public class Main {
}
