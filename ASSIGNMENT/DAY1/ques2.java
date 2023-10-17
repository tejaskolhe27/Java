//Write a program to add two numbers and store the result in a third variable. Print the result.

package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("The addition is: "+c);


    }
    
}
