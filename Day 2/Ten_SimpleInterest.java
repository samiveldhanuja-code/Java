import java.util.*;
public class Ten_SimpleInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double years=sc.nextDouble();

        double si=(principal*rate*years)/100;
        double amount=principal+si;

        System.out.println("Simple Interest = "+si);
        System.out.println("Total Amount = "+amount);
    }
}