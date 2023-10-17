/*
 * WAP to reverse the elements of an array entered by user(without using another array)
 * (also accept sze of user)
 */
package Arrays;

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
