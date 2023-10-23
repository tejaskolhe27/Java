package ASSIGNMENT.DAY8;
import java.util.*;
class Vehicle {
    private int vno;
    private String vname;
    private double cost;
    public Vehicle(){
        vno=0;
        vname="abc";
        cost=100000;
    }
    public Vehicle(int vno, String vname, double cost) {
        this.vno = vno;
        this.vname = vname;
        this.cost = cost;
    }

    public int getVno() {
        return vno;
    }
    public void setVno(int vno) {
        this.vno = vno;
    }

    public String getVname() {
        return vname;
    }
    public void setVname(String vname) {
        this.vname = vname;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + vno;
        result = prime * result + ((vname == null) ? 0 : vname.hashCode());
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Vehicle other = (Vehicle) obj;
        if (vno != other.vno)
            return false;
        if (vname == null) {
            if (other.vname != null)
                return false;
        } else if (!vname.equals(other.vname))
            return false;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        return true;
    }
    public void display() {
        System.out.println("Vehicle no=" + vno + " Vehicle name=" + vname + " Vehicle cost=" + cost);
    }

     public static Comparator<Vehicle> costComparator = new Comparator<Vehicle>() {
        @Override
        public int compare(Vehicle v1, Vehicle v2) {
            return Double.compare(v1.getCost(), v2.getCost());
        }
    };
    
    
}

public class ques2 {
    public static void main(String[] args) {
       
        Set<Vehicle> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Add Vehicle record into the hashset\n2.Display details of all vehicles from HashSet\n3.Display maximum and minimum cost of vehicle from HashSet");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the vehicle number: ");
                    int no = sc.nextInt();
                    System.out.println("Enter the vehicle name: ");
                    String name = sc.next();
                    System.out.println("Enter the cost of vehicle: ");
                    double cost = sc.nextDouble();
                    s.add(new Vehicle(no, name, cost));
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println("The details of all vehicles are: ");
                    for(Vehicle v1:s){
                        v1.display();
                    }
                    System.out.println();
                    break;
                
                case 3:
                    Vehicle minCostVehicle = Collections.min(s, Vehicle.costComparator);
                    System.out.println("The minimum cost vehicle is: " + minCostVehicle.getCost());
                    Vehicle maxCostVehicle = Collections.max(s, Vehicle.costComparator);
                    System.out.println("The maximum cost vehicle is: " + maxCostVehicle.getCost());
                    break;
        
                default:
                    System.out.println("Thank You!!!");
                    break;
            }
        }while(ch!=4);
    }   
}
