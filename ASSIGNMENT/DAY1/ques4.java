/*
 * Write a program to calculate Net Salary of an employee. Accept Basic Salary (BS) from the user.  
 *                                  	
 * HRA is 15% of BS										
 * DA is 30% of BS											
 * PF is 12.5% of GS										
 * Gross Salary is BS + HRA + DA									
 * Net Salary = Gross Salary – PF
 */
package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base_salary;
        System.out.println("Enter the base salary: ");
        base_salary=sc.nextDouble();
        double hra=0.15*base_salary;
        double da=0.3*base_salary;
        double gs=base_salary+hra+da;
        double pf=0.125*gs;
        double net_salary=gs-pf;
        System.out.println("The Net salary is: "+net_salary);

    }
}
