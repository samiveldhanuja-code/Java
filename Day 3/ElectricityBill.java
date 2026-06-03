import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units;
        double bill;

        // Input units consumed
        System.out.print("Enter electricity units consumed: ");
        units = sc.nextInt();

        // Calculate bill amount
        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units <= 300) {
            bill = (100 * 2) + ((units - 100) * 3);
        } 
        else {
            bill = (100 * 2) + (200 * 3) + ((units - 300) * 5);
        }

        // Display result
        System.out.println("Total Electricity Bill = ₹" + bill);

        sc.close();
    }
}