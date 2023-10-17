//Write a program to swap two variables using a third variable and without using third variable.
package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The swapped numbers are: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
    }    
}
