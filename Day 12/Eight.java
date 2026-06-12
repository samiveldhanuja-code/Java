import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Queue<String> patients = new LinkedList<>();
        patients.add("Patient A"); patients.add("Patient B"); patients.add("Patient C");
        System.out.println("Next Patient: " + patients.peek());
        System.out.println("Served: " + patients.poll());
        System.out.println("Next Patient: " + patients.peek());
    }
}