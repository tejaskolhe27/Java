package com.multithreading;

public class SecondThread extends Thread {
	private int n;

	public SecondThread(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" Table Value at "+i+" Position: "+(n*i));
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
