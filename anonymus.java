interface A{
    public void show();

}

public class anonymus {
    public static void main(String[] args) {
        A a =new A(){
            public void show(){
                System.out.println("This is Anonymous Inner class Demo");
            }

        };
        a.show();
    }
    
}
