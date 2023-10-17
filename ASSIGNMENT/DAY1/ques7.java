/*
 * Write a program to find maximum of three numbers using conditional operators.
 */
package ASSIGNMENT.DAY1;
import java.util.Scanner;
public class ques7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Greatest number is: ");
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
