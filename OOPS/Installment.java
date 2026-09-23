package OOPS;
import java.util.Scanner;

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
        int installmentNo;
        int remainder = amount % months;
        int balance = amount;



    for ( installmentNo = 1; installmentNo <= months; installmentNo++) {
            int currentInstallment = installmentAmount;
            if (remainder > 0) {
                currentInstallment++;
                remainder--;
            }
            System.out.println("Installment " + installmentNo + ": " + currentInstallment+ " Balance: "+balance);
        }
    }
}

