import java.util.*;
public class Three {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("Java"); arrayList.add("Python");
        linkedList.add("Java"); linkedList.add("Python");
        arrayList.add(1,"C++");
        linkedList.add(1,"C++");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}