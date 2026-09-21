package Pract_Question;
import java.util.Scanner;

public class Installment {
    
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
            System.out.println("Installment " + installmentNo + ": " + installmentAmount);
            balance -= installmentAmount;
            installmentNo++;
            


    }

}
}

