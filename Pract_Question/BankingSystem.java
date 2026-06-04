package Pract_Question;

import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Name: " + accountHolderName + ", Balance: " + balance);
    }
}

public class BankingSystem {
    static BankAccount[] accounts = new BankAccount[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BANKING SYSTEM MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Update Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Deposite Money");
            System.out.println("6. Withdraw Money");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        createAccount(sc);
                        break;
                    case 2:
                        viewAccounts();
                        break;
                    case 3:
                        updateAccount(sc);
                        break;
                    case 4:
                        deleteAccount(sc);
                        break;
                    case 5:
                        deposite(sc);
                        break;
                    case 6:
                        withdraw(sc);
                    case 7:
                        System.out.println("Exiting program. Thank you!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values only.");
                sc.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
    static void deposite(Scanner sc){
        try{
        if(count==0){
            createAccount(sc);
        }
        else{
            System.out.println("Enter your account number");
            int accNo = sc.nextInt();
            for(int i =0;i<count;i++){
                if(accounts[i].accountNumber == accNo ){
                    System.out.println("Enter the amount to be deposited");
                    int dipmoney = sc.nextInt();
                    if(dipmoney<=0){
                        throw new Exception("Invalid Amount please try again");
                    }
                    accounts[i].balance += dipmoney;
                    System.out.println("Amount deposited successfully");
                }else {
                    System.out.println("Account not found");
                    createAccount(sc);
                }

            }
        }
    }catch(Exception e){
        System.out.println("Unexpected error occured "+ e.getMessage());
    }
    }
    
    static void withdraw(Scanner sc){
        try{
            if(count==0){
                createAccount(sc);
            }
            else{
                System.out.println("Enter your account number");
                int accNo = sc.nextInt();
                for(int i =0;i<count;i++){
                    if(accounts[i].accountNumber==accNo){
                        System.out.println("Enter the amount to be withdrawn");
                        int witmoney=sc.nextInt();
                        if(accounts[i].balance<witmoney){
                            throw new IllegalArgumentException("Not enough balance");
                        }
                        accounts[i].balance-=witmoney;
                        System.out.println("amount withdrawn successfully");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Unexpected error occured"+e.getMessage());

        }
    }

    static void createAccount(Scanner sc) {
        if (count >= accounts.length) {
            System.out.println("Cannot create more accounts. Limit reached.");
            return;
        }

        try {
            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < count; i++) {
                if (accounts[i].accountNumber == accNo) {
                    throw new IllegalArgumentException("Account number already exists.");
                }
            }

            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();

            if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative.");

            accounts[count++] = new BankAccount(accNo, name, balance);
            System.out.println("Account created successfully.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data types.");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void viewAccounts() {
        if (count == 0) {
            System.out.println("No accounts to display.");
            return;
        }

        System.out.println("=== Account List ===");
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
    }

    static void updateAccount(Scanner sc) {
        System.out.print("Enter account number to update: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                System.out.print("Enter new account holder name: ");
                String name = sc.nextLine();
                System.out.print("Enter new balance: ");
                double balance = sc.nextDouble();

                if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative.");

                accounts[i].accountHolderName = name;
                accounts[i].balance = balance;
                System.out.println("Account updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    static void deleteAccount(Scanner sc) {
        System.out.print("Enter account number to delete: ");
        int accNo = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[--count] = null;
                System.out.println("Account deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }
}