/*
 * Write a program for matchstick game between the computer and the user.  
 * Your program should ensure that the computer always wins. 
 * Rules for the game are as follows:				
 * a. There are 21 matchsticks									
 * b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.					
 * C. Player is given the chance to pick the sticks first then the computer picks the sticks.		
 * d. Whoever is forced to pick up the last matchstick loses the game.
 */
package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int m=21;
       int c;
       System.out.println("WELCOME TO THE MATCHSTICK GAME!!!");
       System.out.println("There are 21 matchsticks");
       System.out.println("Rules for the game are as follows:\na. There are 21 matchsticks\nb. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.\nc. Player is given the chance to pick the sticks first then the computer picks the sticks.\nd. Whoever is forced to pick up the last matchstick loses the game.\n");
       while(true){
        System.out.println("Number of matchsticks left = " + m);
        System.out.println("Pick 1 or 2 or 3 or 4 matches");
        int p=sc.nextInt();
            if(p>=1 & p<=4){
                m=m-p;
                System.out.println("The number of matchsticks left: "+m);
                c=5-p;
                System.out.println("Computer picked "+c);
                m=m-c;
                if (m == 1) {

                    System.out.println("Number of matchsticks left = " + m);
                    System.out.println("You lost the Game");
                    break;
            }    
       }
       
    }
}
}