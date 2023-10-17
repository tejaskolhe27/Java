/*
 * Write a program to print whether user entered number is an Armstrong number.
 * Armstrong number is one for which the sum of the cube of all its digits is same as the number.  For example, 153 = (1*1*1) + (5*5*5) + (3*3*3)
 */
package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(temp!= 0){
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if(sum == n){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }        
    }
}
