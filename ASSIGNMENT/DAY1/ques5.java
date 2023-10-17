/*
 * Write a program to accept the basic salary and total sales amount for a salesperson and 
 * calculate commission according to sales amount. Display the net salary and commission earned. (Net Salary = Basic Salary + Commission)
 */

package ASSIGNMENT.DAY1;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base_salary;
        System.out.println("Enter the base salary: ");
        base_salary=sc.nextDouble();
        System.out.println("Enter the total sales: ");
        double total_sales=sc.nextDouble();
        double net_salary,commission;
        if(total_sales>=5000 & total_sales<=7500){
            commission=0.03*total_sales;
            net_salary=base_salary+commission;
            System.out.println("Commission = "+commission);
            System.out.println("Net salary = "+net_salary);
        }
        else if(total_sales>=7501 & total_sales<=10500){
            commission=0.08*total_sales;
            net_salary=base_salary+commission;
            System.out.println("Commission = "+commission);
            System.out.println("Net salary = "+net_salary);
        }
        else if(total_sales>=10501 & total_sales<=15000){
            commission=0.11*total_sales;
            net_salary=base_salary+commission;
            System.out.println("Commission = "+commission);
            System.out.println("Net salary = "+net_salary);
        }
        else {
            commission=0.15*total_sales;
            net_salary=base_salary+commission;
            System.out.println("Commission = "+commission);
            System.out.println("Net salary = "+net_salary);
        }
        
    }
    
}