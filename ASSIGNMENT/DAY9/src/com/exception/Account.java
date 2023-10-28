package com.exception;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public Account() {
		super();
		this.balance = 1000.0;
	}
	public void deposite(double x) {
		if(x>0)
		{
			double total=x+this.getBalance();
			this.setBalance(total);
			System.out.println("your account is credited with "+x);
			System.out.println("your total Balance is "+this.getBalance());
		}
		else
		{
			System.out.println("Please enter valid amount");
		}
	}
	void withdraw(double x) throws InsufficientBalance, OverLimit
	{
		if(x>0)
		{
			if(x>15000)
			{
				throw new OverLimit("you have withdrawl Limit of 15000/- per Transaction.");
			}
			else
			{
				double total=this.getBalance()-x;
				if(total>=0)
				{
					this.setBalance(total);
					System.out.println("your account is debited with "+x);
					System.out.println("your total Balance is "+this.getBalance());
				}
				else
				{
					throw new InsufficientBalance("you don't have sufficient balance in your account.");
				}	
			}
		}
		
	}
}
