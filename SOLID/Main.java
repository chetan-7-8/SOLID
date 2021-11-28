package SOLID;

import java.util.List;

//Single Responsibility
interface ILoanCalculator{
    public double calculateLoan();
}

class LoanCalculator implements ILoanCalculator{

    @Override
    public double calculateLoan() {
        return 1000;
    }
}

//Open-clos
interface ILoanAccount{
    boolean processApplication();
}

class ChetanAccount implements ILoanAccount{

    @Override
    public boolean processApplication() {
        //calculate if person has successful application
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
//No to make payment you can choose either of card Credit or Debit.

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
