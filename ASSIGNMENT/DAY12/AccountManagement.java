package ASSIGNMENT.DAY12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import OOPS.cdac.Laptop;

class Account implements Serializable {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance;
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accountList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Deposit to Account");
            System.out.println("4. Withdraw from Account");
            System.out.println("5. Display Accounts with Balance < 19000");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();

                    Account account = new Account(accountNumber, name, balance);
                    accountList.add(account);
                    saveAccountsToFile(accountList);
                    break;

                case 2:
                    loadAccountsFromFile();
                    break;

                case 3:
                    System.out.print("Enter Account Number to Deposit: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    depositToAccount(accountList, depositAccountNumber, depositAmount);
                    saveAccountsToFile(accountList);
                    break;

                case 4:
                    System.out.print("Enter Account Number to Withdraw: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdrawFromAccount(accountList, withdrawAccountNumber, withdrawAmount);
                    saveAccountsToFile(accountList);
                    break;

                case 5:
                    List<Account> filteredAccounts = accountList.stream()
                            .filter(acc -> acc.getBalance() < 19000)
                            .collect(Collectors.toList());
                    filteredAccounts.forEach(System.out::println);
                    break;

                case 6:
                    scanner.close();
                    saveAccountsToFile(accountList);
                    System.exit(0);
            }
        }
    }

    private static void saveAccountsToFile(List<Account> accountList) {

        File file = new File("ASSIGNMENT/DAY12/account_data.dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(accountList);
            System.out.println("Accounts saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadAccountsFromFile() {

        File file = new File("ASSIGNMENT/DAY12/account_data.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Account> a = (List<Account>) ois.readObject();
            System.out.println(a);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void depositToAccount(List<Account> accountList, int accountNumber, double amount) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                System.out.println("Deposit successful.");
                saveAccountsToFile(accountList);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void withdrawFromAccount(List<Account> accountList, int accountNumber, double amount) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                System.out.println("Withdrawal successful.");
                saveAccountsToFile(accountList);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}