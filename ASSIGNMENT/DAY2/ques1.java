/*
 * Accept five integers in an array -
Find maximum and minimum of the integers. Do not sort the array.
Multiply each element of the array by 5 and store it in another array and display it.

 */

package ASSIGNMENT.DAY2;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int [] b = new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i]*5;
        }
        System.out.println("The multiplied array is: ");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("The reversed array is: ");
        for(int i=0,j=a.length-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
