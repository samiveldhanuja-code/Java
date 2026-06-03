import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, bonus, finalSalary;
        int experience;

        // Input salary and experience
        System.out.print("Enter employee salary: ₹");
        salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        experience = sc.nextInt();

        // Calculate bonus
        if (experience > 5) {
            bonus = salary * 0.20;
        } else {
            bonus = salary * 0.10;
        }

        // Calculate final salary
        finalSalary = salary + bonus;

        // Display results
        System.out.println("Bonus Amount = ₹" + bonus);
        System.out.println("Final Salary = ₹" + finalSalary);

        sc.close();
    }
}
