import java.util.*;
public class Nine_ATMWithdrawal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double balance=sc.nextDouble();
        double withdraw=sc.nextDouble();

        if(withdraw%100==0 && (balance-withdraw)>=1000)
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Withdrawal Failed");
    }
}