package Ch_object;

import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        int balance = 500;
        int amt_withdraw;
        /*System.out.println(" Automated Teller Machine ");
        System.out.println(" Choose 1 for Withdraw");
        System.out.println(" Choose 2 for Deposit");
        System.out.println(" Choose 3 for Check Balance");
        System.out.println(" Choose 4 for Exit");*/

        Scanner input = new Scanner(System.in);
        while(true) {
        //System.out.println("Choose the Operation you want to perform :");
            System.out.println(" Automated Teller Machine ");
            System.out.println(" Choose 1 for Withdraw");
            System.out.println(" Choose 2 for Deposit");
            System.out.println(" Choose 3 for Check Balance");
            System.out.println(" Choose 4 for Exit");
            System.out.println("Choose the Operation you want to perform :");
        int choice = input.nextInt();
        System.out.println(choice);
       // while(true) {

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw");

                     amt_withdraw = input.nextInt();
                    if (amt_withdraw < balance) {
                        balance = balance - amt_withdraw;
                        System.out.println("Amount withdrawn successfully.");
                        System.out.println("Your current balance is:" + balance);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter deposit amount");
                    int deposit_amt = input.nextInt();
                    System.out.println("Amount deposited successfully ");
                    balance = balance + deposit_amt;
                    System.out.println("Your amount after deposit is :" + balance);
                    break;
                case 3:
                    System.out.println("Your current balance is " + balance);
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }




    }

