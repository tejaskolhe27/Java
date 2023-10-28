package com.exception;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Account acc=new Account();
		
		int ch;
		do
		{
			System.out.println("1. Deposit\n"
					+ "2. Withdraw\n"
					+ "3. Show Balance\n"					
					+ "4. Exit");
			System.out.println("Enter a choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:					
					System.out.println("Enter amount to Deposit: ");					
					double amt=sc.nextDouble();
					acc.deposite(amt);
					break;
				case 2:
					System.out.println("Enter amount to Withdrawl: ");					
					amt=sc.nextDouble();
					try {
						acc.withdraw(amt);
					} catch (InsufficientBalance | OverLimit e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
					break;
				case 3:
					System.out.println("Balance: "+acc.getBalance());					
					break;				
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong Choice!");
			}
		}while(ch!=4);
	}

}
