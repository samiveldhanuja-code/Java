import java.util.*;
public class One {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Ali");
        students.add("John");
        students.add("Sara");
        System.out.println("Original List: " + students);
        students.set(1, "David");
        System.out.println("After Update: " + students);
        students.remove("Ali");
        System.out.println("After Remove: " + students);
        System.out.println(students.contains("Sara") ? "Sara Found" : "Sara Not Found");
    }
}