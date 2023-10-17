package Arrays;

import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};    //Initialzed 2D array
        int [][] b = {{1,2,3,4},{5,6},{7,8,9}};    //Jagged arrays
        int [][] c = new int[][]{{1,2,3},{4,5,6}}; //Initialzed 2D array
        
        int [][] d = new int[3][];
        d[0]=new int[3];
        d[1]=new int[5];
        d[2]=new int[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                d[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of array are: ");
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        //Using for each loop
        System.out.println("FOR EACH LOOP");
        System.out.println("The elements of array are: ");
        for(int[] temp:d)
        {
            for(int val:temp)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}