/*
 * Construct a hierarchy of employees.

a. Create an Employee class with attributes like employee id, name, date of birth.
b. Inherit class WageEmployee from super class Employee
c. WageEmployee class should have following members
		a. Number of hours worked
		b. Rate per hour

d. Inherit class SalesPerson from super class WageEmployee. SalesPerson should have following members
		a. Number of items sold
		b. Commission per item
e. Write constructors for WageEmployee and SalesPerson  classes. 
f. Override the methods for displaying details, calculating salary in WageEmployee and SalesPerson class. 
		WageEmployee Salary = hours * rate
		SalesPerson Salary = hours*rate + sales*commission
 */

package ASSIGNMENT.DAY4.ques2;

public class Employee {
    private int empid;
    private String name;
    private Date dob;

    //Default constructor
    public Employee(){
        empid=101;
        name="abc";
        dob = new Date();
    }

    //Parameterized constructor
    public Employee(int empid, String name, int d,int m,int y) {
        this.empid = empid;
        this.name = name;
        this.dob = new Date(d, m, y);
    }

    public void show(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+name);
        System.out.print("Date of Birth: ");
        dob.show();
    }  
}
