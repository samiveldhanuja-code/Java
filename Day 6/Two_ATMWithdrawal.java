import java.util.*;
public class Two_ATMWithdrawal{
static boolean validate(double bal,double amt){return amt<=bal;}
static double update(double bal,double amt){return bal-amt;}
public static void main(String[] args){Scanner sc=new Scanner(System.in);double bal=sc.nextDouble(),amt=sc.nextDouble();if(validate(bal,amt)) System.out.println("Balance="+update(bal,amt)); else System.out.println("Insufficient Balance");}
}