import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate, years;
        double simpleInterest, totalAmount;

        // Input values
        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        years = sc.nextDouble();

        // Calculate Simple Interest
        simpleInterest = (principal * rate * years) / 100;

        // Calculate Total Amount
        totalAmount = principal + simpleInterest;

        // Display results
        System.out.println("Simple Interest = ₹" + simpleInterest);
        System.out.println("Total Amount to be Paid = ₹" + totalAmount);

        sc.close();
    }
}