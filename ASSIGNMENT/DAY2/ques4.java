//Write a method “add” to add n number of integers. Use VarArgs
package ASSIGNMENT.DAY2;

import java.util.Scanner;

public class ques4 {
    public static int add(int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The addition of n numbers is: ");
        System.out.println(add(a));
    }
}
