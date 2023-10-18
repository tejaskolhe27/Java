/*
 * Construct a hierarchy of employees.
	1. Create an Employee class with attributes like employee id, name, basic salary.
	2. Inherit class Manager and MarketingExecutive from super class Employee
	3. Manager class should have following members
		a. Petrol Allowance: 8% of basic salary
		b. Food Allowance: 12% of basic salary
		c. Other Allowance: 4% of basic salary
	4. MarketingExecutive class should have following members
		a. Kilometers travelled
		b. Tour Allowance: Rs.5/- per kilometer
		c. Telephone Allowance Rs.2000/-
	5. Write constructors for the derived classes. (Use super keyword)
	6. Implement methods - display, calculateGrossSalary and calculateNetSalary in Manager
	   and MarketingExecutive class. 
		gross salary = basic salary + allowances
		net salary = gross salary - PF
		PF = 12.5% of basic salary
Create objects of above classes inside main method and display them.

 */
package ASSIGNMENT.DAY4.ques3;

public class Employee {
    private int empid;
    private String name;
    private double bsalary;

    public Employee(){
        empid=0;
        name="abc";
        bsalary=10000;
    }
    public Employee(int empid, String name, double bsalary) {
        this.empid = empid;
        this.name = name;
        this.bsalary = bsalary;
    }

    public double salary(){
        return bsalary;
    }
    public void show(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+name);
        System.out.println("Basic Salary: "+bsalary);
    }

    
}
