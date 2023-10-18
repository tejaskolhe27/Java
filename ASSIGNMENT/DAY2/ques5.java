/*
 * Create a class AccountHolder with -
		Instance variables - account number, account holder name, account balance
		Class methods - constructors, getter/setter methods, deposite, withdraw
	Create an array of AccountHolder objects in main. 
	Write a menu driven program to perform -
			1. Add record for account holder
			2. Display details of all account holders.
			3. Deposite an amount into perticular account
			4. Withdraw an amount from perticular account
 */

package ASSIGNMENT.DAY2;

import java.util.Scanner;

class AccountHolder{
    private int acc_no;
    private String acc_name;
    private double acc_balance;

    //Constructor
    public AccountHolder(int acc_no, String acc_name, double acc_balance) {
        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.acc_balance = acc_balance;
    }

    public int getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_name() {
        return acc_name;
    }
    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public double getAcc_balance() {
        return acc_balance;
    }
    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public double deposit(double deposit){
        acc_balance+=deposit;
        return acc_balance;
    }

    public double withdraw(double withdraw){
        acc_balance-=withdraw;
        return acc_balance;
    }

    @Override
    public String toString() {
        return "AccountHolder [acc_no=" + acc_no + ", acc_name=" + acc_name + ", acc_balance=" + acc_balance + "]";
    }
    
}


public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add record for account holder\n" + //
                "2. Display details of all account holders\n" + //
                "3. Deposit an amount into a particular account\n" + //
                "4. Withdraw an amount from a particular account\n" +
                "5. Exit");
        
        int choice;
        int maxAccounts = 100; 
        AccountHolder[] accountHolders = new AccountHolder[maxAccounts];
        int numAccounts = 0;

        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (numAccounts < maxAccounts) {
                        System.out.print("Enter account number: ");
                        int accNo = sc.nextInt();
                        System.out.print("Enter account holder name: ");
                        String accName = sc.next();
                        System.out.print("Enter initial balance: ");
                        double accBalance = sc.nextDouble();
                        accountHolders[numAccounts] = new AccountHolder(accNo, accName, accBalance);
                        numAccounts++;
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;
                case 2:
                    System.out.println("Account Details:");
                    for (int i = 0; i < numAccounts; i++) {
                        System.out.println(accountHolders[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter account number to deposit into: ");
                    int depositAccNo = sc.nextInt();
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    for (int i = 0; i < numAccounts; i++) {
                        if (accountHolders[i].getAcc_no() == depositAccNo) {
                            accountHolders[i].deposit(depositAmount);
                            System.out.println("Deposit successful. New balance: " + accountHolders[i].getAcc_balance());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter account number to withdraw from: ");
                    int withdrawAccNo = sc.nextInt();
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    for (int i = 0; i < numAccounts; i++) {
                        if (accountHolders[i].getAcc_no() == withdrawAccNo) {
                            accountHolders[i].withdraw(withdrawAmount);
                            System.out.println("Withdrawal successful. New balance: " + accountHolders[i].getAcc_balance());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);
    }
}