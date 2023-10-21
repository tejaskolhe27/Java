package ASSIGNMENT.DAY6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Employee{
    private int empid;
    private String emp_name;
    private double salary;

    public Employee() {
        empid=0;
        emp_name="abc";
        salary=10000;
    }

    public Employee(int eid, String ename, double sal) {
        empid = eid;
        emp_name = ename;
        salary = sal;
    }

    public void show(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee Salary: "+salary);
    }
    
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", emp_name=" + emp_name + ", salary=" + salary + "]";
    }
    
}
public class ques1 {

    public static void insert(Employee e1,Vector v1){
        v1.add(e1);
    }

    public static void update(int eid,Vector v1){
        Scanner sc = new Scanner(System.in);
        for(Object e1:v1){
            Employee e = (Employee) e1;
            if(e.getEmpid()==eid){
                System.out.println("Enter the new employee name: ");
                String ename= sc.next();
                System.out.println("Enter the new employee salary: ");
                double sal= sc.nextDouble();
                e.setEmp_name(ename);
                e.setSalary(sal);
            }
            else{
                System.out.println("Employee ID not found!!!");
            }
        }

    }

    public static void displayall(Vector v1){
        Iterator<Employee> itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        Vector<Object> v1 = new Vector<>();

        do{
        System.out.println("1. Insert Record into Vector\n2. Update information by emloyee Id\n3. Display All record \n4. exit ");
        System.out.println("Enter your choice  :");
        choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter employee ID: ");
                    int eid=sc.nextInt();
                    System.out.println("Enter the employee name: ");
                    String ename= sc.next();
                    System.out.println("Enter the employee salary: ");
                    double sal= sc.nextDouble();
            
                    Employee e1 = new Employee(eid, ename, sal);
                    insert(e1,v1);
                    break;

                case 2:
                    System.out.println("Enter employee ID: ");
                    int id=sc.nextInt();
                    update(id,v1);
                    break;

                case 3:
                    displayall(v1);
                    break;
                default:
                    System.out.println("Thank You");
                    break;
            }

        }while(choice !=4);

    }
}