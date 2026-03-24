package Training;

import java.nio.channels.Pipe.SourceChannel;

public class BankAccount {
    int accNumber;
    String holderName;
    String typeOfAccount;
    double balance;
    double da;
    double wa;

    BankAccount(int accNumber, String holderName,String typeOfAccount,double balance){
        this.accNumber=accNumber;
        this.holderName=holderName;
        this.typeOfAccount= typeOfAccount;
        this.balance=balance;

    }
    void display(){
        System.out.println("Bank Account Number: "+accNumber+"\nBank Holder Name: " +holderName+"\nType of Account: "+typeOfAccount+"\nInitial Balance: "+balance);

    }
    BankAccount(BankAccount aNo, BankAccount ib,double da){
        accNumber=aNo.accNumber;
        balance =ib.balance;
        this.da=da;
        da=da+ib.balance;
        System.out.println("Deposited Amount: "+da);
    }
}
