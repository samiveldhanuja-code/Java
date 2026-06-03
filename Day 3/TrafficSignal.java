import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String signal;

        // Input signal color
        System.out.print("Enter traffic signal color: ");
        signal = sc.nextLine();

        // Check signal color
        if (signal.equalsIgnoreCase("red")) {
            System.out.println("STOP");
        } 
        else if (signal.equalsIgnoreCase("yellow")) {
            System.out.println("WAIT");
        } 
        else if (signal.equalsIgnoreCase("green")) {
            System.out.println("GO");
        } 
        else {
            System.out.println("INVALID SIGNAL");
        }

        sc.close();
    }
}