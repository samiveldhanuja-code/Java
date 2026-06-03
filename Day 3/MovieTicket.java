import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        double amount;

        // Input age
        System.out.print("Enter age: ");
        age = sc.nextInt();

        // Check ticket category and amount
        if (age < 5) {
            amount = 0;
            System.out.println("Ticket Category: Free Entry");
        } 
        else if (age <= 18) {
            amount = 100;
            System.out.println("Ticket Category: Child Ticket");
        } 
        else {
            amount = 200;
            System.out.println("Ticket Category: Adult Ticket");
        }

        // Display amount
        System.out.println("Ticket Amount = ₹" + amount);

        sc.close();
    }
}
