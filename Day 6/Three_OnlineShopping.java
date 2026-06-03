import java.util.*;
public class Three_OnlineShopping{
static double discount(double amt){return amt*0.10;}
static double finalBill(double amt){return amt-discount(amt);}
public static void main(String[] args){Scanner sc=new Scanner(System.in);double amt=sc.nextDouble();System.out.println("Discount="+discount(amt));System.out.println("Final="+finalBill(amt));}
}