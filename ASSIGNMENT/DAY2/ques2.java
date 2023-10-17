/*
 * Write a program to accept and display 3 by 3 matrix. Use enhanced for loop for display.
Find the transpose of a matrix and print the transpose. 
Accept another matrix of same dimensions.  Find the addition of two matrices and print the resultant matrix. 
 */
package ASSIGNMENT.DAY2;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("Enter matrix A elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix A is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("The transpose of matrix is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               System.out.print(a[j][i]+" "); 
            }
            System.out.println();
        }

        int[][] b=new int[3][3];
        System.out.println("Enter matrix B elements: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix B is: ");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
               System.out.print(b[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("The addition of matrix A and B is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               System.out.print((a[i][j]+b[i][j])+" "); 
            }
            System.out.println();
        }

    }   
}