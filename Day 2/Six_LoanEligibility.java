import java.util.*;
public class Six_LoanEligibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double salary=sc.nextDouble();
        boolean activeLoan=sc.nextBoolean();

        if(age>=21 && salary>=30000 && !activeLoan)
            System.out.println("Eligible for Loan");
        else
            System.out.println("Not Eligible for Loan");
    }
}