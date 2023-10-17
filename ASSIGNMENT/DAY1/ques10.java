/*
 * Write a program to generate all possible combinations of 1, 2, 3 using for loop.
 */
package ASSIGNMENT.DAY1;

public class ques10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    if(i!=j & i!=k & j!=k){
                    System.out.println(i +""+ j +""+ k);
                    }
                }
            }
        }
    } 
}
