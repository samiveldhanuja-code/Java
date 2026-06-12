import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Document1.pdf"); q.add("Document2.pdf"); q.add("Document3.pdf");
        while(!q.isEmpty()) System.out.println("Printing: " + q.poll());
    }
}