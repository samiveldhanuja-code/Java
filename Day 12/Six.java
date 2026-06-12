import java.util.*;
public class Six {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Customer 1"); q.add("Customer 2"); q.add("Customer 3");
        while(!q.isEmpty()) System.out.println("Serving: " + q.poll());
    }
}