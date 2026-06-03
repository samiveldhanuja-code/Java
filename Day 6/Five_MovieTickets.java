import java.util.*;
public class Five_MovieTickets{
static double total(int a,int c){return a*200+c*100;}
static double discount(double t){return t>1000?t*0.1:0;}
public static void main(String[] args){Scanner sc=new Scanner(System.in);int a=sc.nextInt(),c=sc.nextInt();double t=total(a,c);System.out.println("Total="+t);System.out.println("Discount="+discount(t));}
}