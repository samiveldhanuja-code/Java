import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double purchaseAmount, discount, finalAmount;

        // Input purchase amount
        System.out.print("Enter total purchase amount: ₹");
        purchaseAmount = sc.nextDouble();

        // Calculate discount
        if (purchaseAmount > 5000) {
            discount = purchaseAmount * 0.20;
        } 
        else if (purchaseAmount > 2000) {
            discount = purchaseAmount * 0.10;
        } 
        else {
            discount = 0;
        }

        // Calculate final payable amount
        finalAmount = purchaseAmount - discount;

        // Display results
        System.out.println("Discount = ₹" + discount);
        System.out.println("Final Payable Amount = ₹" + finalAmount);

        sc.close();
    }
}

