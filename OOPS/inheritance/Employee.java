package OOPS.inheritance;

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
        System.out.println(empid);
        System.out.println(name);
        dob.show();
    }  
}
