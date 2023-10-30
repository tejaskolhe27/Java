package Files_hand;

import java.io.*;

class Laptop implements Serializable{
    private int no;
    private String name;
    private double price;
    
    public Laptop(int no, String name, double price) {
        super();
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Laptop [no=" + no + ", name=" + name + ", price=" + price + "]";
    }
  
    
}

public class handling1 {
    public static void main(String[] args) {
        File file = new File("Files_hand/demo2.dat");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Laptop(1001,"Dell", 1000));
            oos.writeObject(new Laptop(1002,"HP", 10000));
            oos.close();
            fos.close();
            System.out.println("Object is saved");
        } catch (Exception e) {
            
            e.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Laptop l1 = (Laptop)ois.readObject();
            System.out.println(l1);
            Laptop l2 = (Laptop)ois.readObject();
            System.out.println(l2);
            ois.close();
            fis.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }


    
}
