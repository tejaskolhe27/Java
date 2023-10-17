import java.util.Scanner;
public class average {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter 5 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        float avg = (a+b+c+d+e)/5;
        System.out.println("The average is: "+avg);

    }
}
