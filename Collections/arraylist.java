package Collections;

import java.util.*;

class Laptop implements Comparable<Laptop>{
    private int srno;
    private String make;
    private double cost;

    public Laptop(int srno, String make, double cost) {
        this.srno = srno;
        this.make = make;
        this.cost = cost;
    }
    

    public int getSrno() {
        return srno;
    }


    public void display(){
        System.out.println(srno+" "+make+" "+cost);
    }

    @Override
    public String toString() {
        return "Laptop [srno=" + srno + ", make=" + make + ", cost=" + cost + "]";
    }

    @Override
    public int compareTo(Laptop o){
        if(this.cost>o.cost){
            return 1;
        }
        else if(this.cost<o.cost){
            return -1;
        }
        else{
            return 0;
        }
    }

    
}

class CompareLaptops implements Comparator<Laptop>
{
    public int compare(Laptop o1,Laptop o2){

        if(o1.getSrno()>o2.getSrno())
            return 1;
        else if (o1.getSrno()<o2.getSrno())
            return -1;
        else
            return 0; 
    }
}



public class arraylist {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop(101,"hp",40000));
        list.add(new Laptop(103, "apple", 90000));
        list.add(new Laptop(102, "lenovo", 60000));
        System.out.println(list);

        for(Laptop l:list){
            l.display();
        }

        Collections.sort(list,new CompareLaptops());
        System.out.println();

        for(Laptop l:list){
            l.display();
        }
    }
}
