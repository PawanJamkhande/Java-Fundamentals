package OOPS;
import java.util.Scanner;
//distribute all the remaining amount to installment amount equally
public class Installment {
    public static void main(String[]args){
        Installment obj = new Installment();
        obj.getInput();
        obj.calculateInstallment();
    }
    Scanner sc = new Scanner(System.in);
    int amount, months;

    public void getInput(){
        System.out.println("Enter the amount: ");
        amount = sc.nextInt();
        System.out.println("Enter the number of months: ");
        months = sc.nextInt();
    }
    public void calculateInstallment(){
        int installmentAmount = amount / months;
        int installmentNo=1;
        int balance = amount;

        while(balance > 0){
            if(balance%months!=0 && installmentNo== months){
                installmentAmount = balance;
            }
            System.out.println("Installment " + installmentNo + ": " + installmentAmount + " Remainin Amount :"+ balance);
            balance -= installmentAmount;
            installmentNo++;
            
    }

}
}

