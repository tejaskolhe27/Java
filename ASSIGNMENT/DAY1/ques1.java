// Write a program to accept marks of five subjects from the user and calculate their average

package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter 5 subject marks: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        float avg = (a+b+c+d+e)/5;
        System.out.println("The average is: "+avg);
    }
}
