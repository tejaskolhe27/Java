package ASSIGNMENT.DAY5;

class vehicle implements Cloneable{
    private int veh_no;
    private String veh_name;
    private double veh_price;

    public vehicle(){
        veh_no=0;
        veh_name="abc";
        veh_price=0;
    }

    public vehicle(int vno, String vname, double vprice) {
        veh_no = vno;
        veh_name = vname;
        veh_price = vprice;
    }

    public void print(){
        System.out.println("Vehicle No. : "+veh_no);
        System.out.println("Vehicle Name : "+veh_name);
        System.out.println("Vehicle Price : "+veh_price);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }  
}
public class ques2 {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        vehicle v1 = new vehicle(101, "Harrier", 2582496);
        vehicle v2=(vehicle)v1.clone();
        v2.print();
    }
}
