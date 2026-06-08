package Collections;

import java.util.*;

public class BankManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();

        while (true) {

            try {

                System.out.println("\n1.Create Account");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Display Accounts");
                System.out.println("5.Exit");

                System.out.print("Enter Choice : ");
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:

                        System.out.print("Enter Account No : ");
                        int accNo = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();

                        System.out.print("Enter Balance : ");
                        double bal = sc.nextDouble();

                        list.add(new Account(accNo, name, bal));

                        System.out.println("Account Created");
                        break;

                    case 2:

                        System.out.print("Enter Account No : ");
                        int depAcc = sc.nextInt();

                        System.out.print("Enter Amount : ");
                        double depAmt = sc.nextDouble();

                        for (Account a : list) {
                            if (a.getAccNo() == depAcc) {
                                a.deposit(depAmt);
                                System.out.println("Amount Deposited");
                            }
                        }

                        break;

                    case 3:

                        System.out.print("Enter Account No : ");
                        int withAcc = sc.nextInt();

                        System.out.print("Enter Amount : ");
                        double withAmt = sc.nextDouble();

                        for (Account a : list) {

                            if (a.getAccNo() == withAcc) {

                                a.withdraw(withAmt);

                                System.out.println(
                                        "Withdrawal Successful");
                            }
                        }

                        break;

                    case 4:

                        for (Account a : list) {
                            System.out.println(a);
                        }

                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Only numeric values allowed!");

                sc.nextLine();

            } catch (InsufficientBalanceException e) {

                System.out.println(e.getMessage());

            } catch (Exception e) {

                System.out.println(
                        "Something went wrong!");
            }
        }
    }
}