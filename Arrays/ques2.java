/*
 * WAP to find maximum and minimum numbers from a 1D array without sorting the array
 */
package Arrays;

import java.util.Scanner;

public class ques2 {
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
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);   
    }
}