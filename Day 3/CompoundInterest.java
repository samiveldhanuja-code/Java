import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate, amount;
        int years;

        // Input values
        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        years = sc.nextInt();

        // Calculate Compound Interest Amount
        amount = principal * Math.pow((1 + rate / 100), years);

        // Display result
        System.out.println("Final Amount after Compound Interest = ₹" + amount);

        sc.close();
    }
}