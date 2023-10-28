package com.multithreading;

import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		FirstThread t1=new FirstThread(n);
		SecondThread t2=new SecondThread(n);
		t1.start();
		t2.start();
	}

}
