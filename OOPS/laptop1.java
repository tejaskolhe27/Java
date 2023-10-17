package OOPS;

class Laptop{
    private int srno;
    private String make;
    private double cost;
    private static int cnt;

    public Laptop()
    {
        srno=101;
        make="hp";
        cost=25000;
        cnt++;
    }

    public  Laptop(int srno,String make,double cost)
    {
        this.srno=srno;
        this.make=make;
        this.cost=cost;
        cnt++;
    }

    public void show()
    {
        System.out.println(srno+" "+make+" "+cost);   
    }
    public static void showCnt()
    {
        System.out.println("Number of objects: "+cnt);
    }
}
public class laptop1 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop(102, "apple", 70000);
        l1.show();
        l2.show();
        Laptop.showCnt();
    }
}
