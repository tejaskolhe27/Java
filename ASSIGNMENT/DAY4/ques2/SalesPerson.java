package ASSIGNMENT.DAY4.ques2;

public class SalesPerson extends WageEmployee {
    private int items;
    private double commision;
    public SalesPerson(){
        items=0;
        commision=0;
    }

    public SalesPerson(int empid, String name, int d, int m, int y, int hours, int rate, int items, double commision) {
        super(empid, name, d, m, y, hours, rate);
        this.items = items;
        this.commision = commision;
    }

    public double salary(){
        double salary = super.salary() + items*commision;
        return salary;
    }
    public void show(){
        super.show();
        System.out.println("Number of items sold: "+items);
        System.out.println("Commission per item: "+commision);
        System.out.println("The salary is: "+salary());
    }
}
