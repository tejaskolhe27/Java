/*
 * Using switch-case construct, write a menu driven program to perform basic calculations 
 * (addition, subtraction, multiplication and division) on two user entered numbers.
 */
package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        double c;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(
                "1.Addition"
                +"\n2.Subtraction"
                +"\n3.Multiplication"
                +"\n4.Division");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                c=a+b;
                System.out.println("The addition is: "+c);
                break;
            case 2:
                c=a-b;
                System.out.println("The subtraction is: "+c);
                break;
            case 3:
                c=a*b;
                System.out.println("The multiplication is: "+c);
                break;
            case 4:
                c=a/b;
                System.out.println("The division is: "+c);
                break;
            default:
                System.out.println("Invalid Input");
                break;
    
    }

}
}
