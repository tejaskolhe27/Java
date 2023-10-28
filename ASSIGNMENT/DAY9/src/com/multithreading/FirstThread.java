package com.multithreading;

public class FirstThread extends Thread {
	private int n;

	public FirstThread(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Next"+i+" Number: "+(n+i));
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
