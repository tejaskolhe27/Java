package Collections;

import java.util.HashSet;
import java.util.Set;

class Product{
    private int pid;
    private String name;
    private float Price;


    public Product(int pid, String name, float price) {
        this.pid = pid;
        this.name = name;
        Price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(Price);
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
        if (Float.floatToIntBits(Price) != Float.floatToIntBits(other.Price))
            return false;
        return true;
    }



    public void display() {
        System.out.println( "pid=" + pid + ", name=" + name + ", Price=" + Price );
    }

    

}

public class hash_set {

    public static void main(String[] args) {
         Set<Product> s = new HashSet<>();
        s.add(new Product(101, "Marker ", 60));
        s.add(new Product(102, "Pen", 10));
        s.add(new Product(103, "notebook", 90));
        
        // System.out.println("Hash Set:");
        // System.out.println(s);

        for (Product p :s){
            p.display();
        }

        Product p1 = new Product(104,"Bottle", 20);
         Product p2 = new Product(104,"Bottle", 20);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
    
}
