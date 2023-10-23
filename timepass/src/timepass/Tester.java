package timepass;

import java.util.Scanner;
import java.util.Vector;

class Employee{
	private int empid;
	private String name;
	private int sal;
	
	public Employee(int empid, String name, int sal) {
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}

	public Employee() {
		super();
		empid = 0;
		name = "None";
		sal = 0;
	}
	

	public int getEmpid() {
		return empid;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Empid : " + empid + "\nName : " + name + "\nSalary : " + sal;
	}
	
}

public class Tester {

	public static void main(String[] args) {
		Vector<Employee> v1 = new Vector<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Add New Employee"
					+ "\n2.Update Employee Salary"
					+ "\n3.Display Employee by ID"
					+ "\n4.Display all"
					+ "\n5.Exit");
			int ch = sc.nextInt();

			if(ch==5) {
				break;
			}
			
			switch(ch) {
			
				case 1:
					System.out.println("Enter Id , Name , Salary ");
					Employee e1 = new Employee(sc.nextInt(),sc.next(),sc.nextInt());
					v1.add(e1);
					break;
						
				case 2:
					System.out.println("Enter Employee Id");
					int id = sc.nextInt();
					for(Employee val:v1) {
						if(val.getEmpid() == id) {
							System.out.println("Enter New Salary : ");
							val.setSal(sc.nextInt());
							System.out.println(val);
							break;
						}
						
					}break;
					
				case 3:
					System.out.println("Enter Employee Id");
					id = sc.nextInt();
					for(Employee val:v1) {
						if(val.getEmpid() == id) {
							System.out.println(val);
							break;
						}
					}
					break;
					
				case 4:
					for(Employee val:v1) 
					{
						System.out.println(val);
					}
			}
		}
		
	}
}


