import java.util.*;
public class Ten {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task 1"); tasks.add("Task 2"); tasks.add("Task 3");
        while(!tasks.isEmpty()) System.out.println("Processing: " + tasks.poll());
    }
}