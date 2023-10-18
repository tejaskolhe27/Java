package ASSIGNMENT.DAY4.ques3;

public class Manager extends Employee{
    private double petrol_allowance;
    private double food_allowance;
    private double other_allowance;

    public Manager(){
        petrol_allowance=0;
        food_allowance=0;
        other_allowance=0;
    }

    public Manager(int empid, String name, double bsalary) {
        super(empid, name, bsalary);
        this.petrol_allowance = 0.08*bsalary;
        this.food_allowance = 0.12*bsalary;
        this.other_allowance = 0.04*bsalary;
    }

    public double GrossSalary(){
        double GrossSalary = salary()+petrol_allowance+food_allowance+other_allowance;
        return GrossSalary;
    }
    public double NettSalary(){
        double pf = 0.12*salary();
        double NettSalary = salary()+pf;
        return NettSalary;
    }

    public void show(){
        super.show();
        System.out.println("The Gross Salary of Manager is: "+ GrossSalary());
        System.out.println("The Nett Salary of Manager is: "+ NettSalary());
    }
}
