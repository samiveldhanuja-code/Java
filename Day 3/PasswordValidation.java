import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Input password
        System.out.print("Enter password: ");
        password = sc.nextLine();

        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Validate password
        if (password.length() >= 8 && hasUppercase && hasDigit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}