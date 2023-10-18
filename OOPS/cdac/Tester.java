package OOPS.cdac;

public class Tester {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop(102, "apple", 70000);
        l1.show();
        l2.show();
        Laptop.showCnt();
}
}
