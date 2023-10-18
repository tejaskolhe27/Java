package OOPS.inheritance;

public class Tester {
    public static void main(String[] args) {
        Employee e1 = new Employee(102,"Jay",23,10,2000);
        e1.show();
        System.out.println("--------------------------------------------------------------------------------");
        WageEmployee we1 = new WageEmployee(101,"Atharva",15,06,2002,15,5000);
        we1.show();
    }
}
