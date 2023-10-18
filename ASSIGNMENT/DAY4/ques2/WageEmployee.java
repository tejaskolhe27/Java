package ASSIGNMENT.DAY4.ques2;


public class WageEmployee extends Employee{
    private int hours;
    private int rate;

    public WageEmployee(){
        hours=0;
        rate=0;
    }

    public WageEmployee(int empid, String name, int d, int m, int y, int hours, int rate) {
        super(empid, name, d, m, y);
        this.hours = hours;
        this.rate = rate;
    }
    public double salary(){
        double salary= hours*rate;
        return salary;
    }
    public void show(){
        super.show();
        System.out.println("Number of hours: "+hours);
        System.out.println("Rate per hour: "+rate);
    }
}
