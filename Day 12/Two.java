import java.util.*;
public class Two {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("D");
        System.out.println("Before Insert: " + list);
        list.add(2, "C");
        System.out.println("After Insert: " + list);
    }
}