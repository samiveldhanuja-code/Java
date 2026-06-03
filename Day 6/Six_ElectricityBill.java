import java.util.*;
public class Six_ElectricityBill{
static double bill(int u){if(u<=100)return u*2; else if(u<=300)return 100*2+(u-100)*3; else return 100*2+200*3+(u-300)*5;}
public static void main(String[] args){Scanner sc=new Scanner(System.in);int u=sc.nextInt();System.out.println("Bill="+bill(u));}
}