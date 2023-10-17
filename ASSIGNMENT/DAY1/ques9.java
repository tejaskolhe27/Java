/*
 * Write a program to display whether a user entered number is prime or not.
 */
package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==0 & num==1){
            System.out.println(num +" is a not Prime number");
        }
        if(num==2){
            System.out.println(num +" is a Prime number");
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime number");;
                break;
             }
             else{
                System.out.println(num +" is a Prime number");
                break;
             }
          
        }
    }   
}
