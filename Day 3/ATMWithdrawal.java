import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance, withdrawAmount;

        // Input account balance
        System.out.print("Enter account balance: ");
        balance = sc.nextInt();

        // Input withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        withdrawAmount = sc.nextInt();

        // Check withdrawal conditions
        if (withdrawAmount % 100 == 0 && (balance - withdrawAmount) >= 1000) {
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance = ₹" + (balance - withdrawAmount));
        } else {
            System.out.println("Withdrawal cannot be processed.");
        }

        sc.close();
    }
}
