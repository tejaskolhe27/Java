package Collections;
import java.util.*;
import java.util.TreeMap;
public class hashmap {
    public static void main(String[] args) {
        Map<Integer, String> m =  new HashMap<>();
        m.put(101,"Maths");
        m.put(103,"English");
        m.put(102,"History");
        System.out.println("HASH MAP");
        System.out.println(m);

        Map<Integer, String> m1 =  new LinkedHashMap<>();
        m1.put(101,"Maths");
        m1.put(103,"English");
        m1.put(102,"History");
        System.out.println("LINKED HASH MAP");
        System.out.println(m1);

        Map<Integer, String> m2 =  new TreeMap<>();
        m2.put(101,"Maths");
        m2.put(103,"English");
        m2.put(102,"History");
        System.out.println("TREE HASH MAP");
        System.out.println(m2);
    }
}
