import java.util.Scanner;

public class Fivee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int remainder = dividend % divisor;

        System.out.println(remainder);
    }
}