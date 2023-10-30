import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.lang.reflect.Array;

interface A{
    public void show();
}

public class lambda {
    public static void main(String[] args) {
        A a=() -> System.out.println("This is lambda syntax");
        a.show();

        List<Integer> list = Arrays.asList(23,100,12,10,1,43);
        list.forEach((x) -> System.out.print(x+" "));
        System.out.println();

        Stream<Integer> stream=list.stream();
        long cnt=stream.count();
        System.out.println("Number of values: "+cnt);

        // stream.forEach(x)->System.out.print(x+" ");

        list.stream().map((t)->t*2).forEach((t)->System.out.print(t+" "));
        System.out.println();

        list.stream().filter((t)->(t%2==0)).forEach((t)->System.out.print(t+" "));
        System.out.println();


    }    
}
