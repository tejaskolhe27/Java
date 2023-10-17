//Write a program which will calculate multiplication of two 3 by 3 matrices.
package ASSIGNMENT.DAY2;

import java.util.Scanner;

public class ques3 {
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
        int[][] c=new int[3][3];
        System.out.println("The matrix multiplication is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=0;
                for(int k=0;k<b[i].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
    }
}
