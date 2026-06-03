import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";
        String enteredPassword;
        int attempts = 0;

        // Allow maximum 3 attempts
        while (attempts < 3) {
            System.out.print("Enter password: ");
            enteredPassword = sc.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect Password.");
            }
        }

        // Lock account after 3 failed attempts
        if (attempts == 3) {
            System.out.println("Account Locked. Too many failed attempts.");
        }

        sc.close();
    }
}