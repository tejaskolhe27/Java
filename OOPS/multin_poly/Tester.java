package OOPS.multin_poly;

interface polygon {
    public double calArea();
    public double calPeri();
}
class Circle implements polygon{
    private int radius;
    
    public Circle() {
        radius=1;
    }
    public Circle(int r){
        radius=r;
    }
    public double calArea(){
        return 3.142*radius*radius;
    }
    public double calPeri(){
        return 2*3.142*radius;
    }
}
class Rectangle implements polygon{
    private int length;
    private int breadth;
    public Rectangle(){
        length=breadth=1;
    }
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public double calArea(){
        return length*breadth;
    }
    public double calPeri(){
        return 2*(length+breadth);
    }
}

class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(int a){
        super(a,a);
    }
    public double calArea(){
        return super.calArea();
    }
    public double calPeri(){
        return super.calPeri();
    }
}


public class Tester{
    public static void main(String[] args) {
        polygon p= new Square(10);
        System.out.println(p.calArea());
        System.out.println(p.calPeri());
    }
}
        
