package OOPS.inheritance;

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

    public void show(){
        super.show();
        System.out.println(hours);
        System.out.println(rate);
    }
}
