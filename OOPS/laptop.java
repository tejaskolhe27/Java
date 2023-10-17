package OOPS;

class Laptop{
    private int srno;
    private String make;
    private double cost;

    //Constructor
    public Laptop(){
        srno=101;
        make="hp";
        cost=1000;
        System.out.println("No argument constructor");
    }

    public Laptop(int sno,String m,double c){
        srno=sno;
        make=m;
        cost=c;
        System.out.println("Arguments/Parameterized constructor");
    }

    public String toString(){
        return "srno: "+srno+" make: "+make+" cost: "+cost;
    }
}
public class laptop {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        Laptop l2=new Laptop(102,"dell",2000);
        Laptop l3=new Laptop();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
    
}
