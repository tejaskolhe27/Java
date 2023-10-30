/*
 * Write a class Account with attributes for account-number(integer), name(String), balance(double) .

Write a menu driven code to -

1. Accept a record of an account holder and save it into the binary file "account_data.dat"

2. Display all records of account holder present in "account data.dat"
 (Load all records from binary file into "ArrayList" and print using lambda syntax)

3. Deposite an amount into perticular account of existing records. 
(Load all records from binary file into "Arraylist" and Search on basis of id. Write updated date back into the file)

4. Withdraw an amount from perticular account of existing records. 
Search on basis of id. (Load all records from binary file into "ArrayList" and Search on basis of id. Write updated data back into the file)

5. Display account details of account holders having balance less than Rs. 19000/-- 
(Load all records from binary file into "ArrayList" and use "filter" stream-api and print using lambda syntax)
 */

package ASSIGNMENT.DAY12;

import java.io.*;
import java.util.Scanner;

class Account implements Serializable{
    private int accno;
    private String acc_name;
    private double balance;


    public Account(int accno, String acc_name, double balance) {
        this.accno = accno;
        this.acc_name = acc_name;
        this.balance = balance;
    }

    public String toString() {
        return "Account Number=" + accno + ", Account Holder name =" + acc_name + ", Balance=" + balance ;
    }  
}


public class ques {

    public static void accept_record(int accno,String acc_name,double balance){
    File file = new File("ASSIGNMENT/DAY12/account_data.dat");

    try{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Account(accno,acc_name,balance));
        oos.close();
        fos.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    }
    public static void displayall(){
        File file = new File("ASSIGNMENT/DAY12/account_data.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Account a = (Account)ois.readObject();
            System.out.println(a);
            ois.close();
            fis.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    public static void deposit(){

    }

    public static void main(String[] args) {
        int choice;
        do{
        System.out.println("1. Add Record\n2.Display all records\n3.Deposit an amount\n4.Withdraw an amount\n5.Display account details of account holders having balance less tha Rs. 20000\n6.Exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the account number: ");
                    int ano=sc.nextInt();
                    System.out.println("Enter the account name: ");
                    String aname=sc.next();
                    System.out.println("Enter the account balance: ");
                    double b=sc.nextDouble();
                    accept_record(ano,aname,b);
                    System.out.println("Account added successfully!!!");
                    break;

                case 2:
                    displayall();
                    break;

                
            }
        }while(choice!=6);
        
    }
    
}
