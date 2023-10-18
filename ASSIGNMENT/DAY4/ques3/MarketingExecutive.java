package ASSIGNMENT.DAY4.ques3;

public class MarketingExecutive extends Employee{
    private int kms_travelled;

    public MarketingExecutive() {
        kms_travelled=0;
    }

    public MarketingExecutive(int empid, String name, double bsalary, int kms_travelled) {
        super(empid, name, bsalary);
        this.kms_travelled = kms_travelled;
    }
    public double allowances(){
        int telephone_allowance=200;
        double allowance = 5*kms_travelled+telephone_allowance;
        return allowance;
    }
    public double GrossSalary(){
        double GrossSalary = salary()+allowances();
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
