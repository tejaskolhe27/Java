package Arrays;
import java.util.Scanner;

public class array_1D {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};                // Initialized 1D array
        int [] b = new int[]{1,2,3,4,5};       // Initialized 1D array
        int [] c = new int[7];                 // Uninitialized 1D array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for(int i=0;i<c.length;i++)
        {
            c[i]=sc.nextInt();
        }
        System.out.println("The Array elements are: ");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();

        // Another way to print array elements
        for (int val:c) {
            System.out.print(val+" ");    
        }
        System.out.println();
    }
}