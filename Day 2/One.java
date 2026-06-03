import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println(circumference);
    }
}