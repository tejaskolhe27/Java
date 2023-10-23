package Collections;
import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(12);
        s.add(4);
        s.add(14);
        s.add(100);
        s.add(12);
        System.out.println("Hash Set:");
        System.out.println(s);

        Set<Integer> s1 = new LinkedHashSet<>();
        s1.add(12);
        s1.add(4);
        s1.add(14);
        s1.add(100);
        s1.add(12);
        System.out.println("Linked Hash Set:");
        System.out.println(s1);

        Set<Integer> s2 = new TreeSet<>();
        s2.add(12);
        s2.add(4);
        s2.add(14);
        s2.add(100);
        s2.add(12);
        System.out.println("Tree Set:");
        System.out.println(s2);
    }
}
