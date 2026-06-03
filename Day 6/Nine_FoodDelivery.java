import java.util.*;
public class Nine_FoodDelivery{
static double delivery(double amt){return amt<500?50:0;}
static double payable(double amt){return amt+delivery(amt);}
public static void main(String[] args){Scanner sc=new Scanner(System.in);double amt=sc.nextDouble();System.out.println("Payable="+payable(amt));}
}