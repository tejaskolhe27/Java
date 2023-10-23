package Collections;

import java.util.*;

class Product implements Comparable<Product>{
    private int pid;
    private String name;
    private float price;


    public Product(int pid, String name, float price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(price);
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (pid != other.pid)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        return true;
    }



    public void display() {
        System.out.println( "pid=" + pid + ", name=" + name + ", price=" + price );
    }

    @Override
    public int compareTo(Product o) {
        if (this.price>o.price)
            return 1;
        else if(this.price <o.price)
            return -1;
        else
            return 0 ;

    }

}

public class treeset {

    public static void main(String[] args) {
        Set<Product> s = new TreeSet<>();
        s.add(new Product(101, "Marker ", 60));
        s.add(new Product(102, "Pen", 10));
        s.add(new Product(103, "notebook", 90));
        
        // System.out.println("Hash Set:");
        // System.out.println(s);

        for (Product p :s){
            p.display();
        }
        
    }
}

