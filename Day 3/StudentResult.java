import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3;
        double average;

        // Input marks
        System.out.print("Enter marks in Subject 1: ");
        sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        sub2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        sub3 = sc.nextInt();

        // Calculate average
        average = (sub1 + sub2 + sub3) / 3.0;

        // Check pass condition
        if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && average >= 50) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        System.out.println("Average Marks = " + average);

        sc.close();
    }
}