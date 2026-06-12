import java.util.*;
public class Nine {
    public static void main(String[] args) {
        Queue<String> waiting = new LinkedList<>();
        waiting.add("Rahim"); waiting.add("Karim"); waiting.add("Hasan");
        System.out.println("Ticket Given To: " + waiting.poll());
    }
}