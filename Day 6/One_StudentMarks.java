import java.util.*;
public class One_StudentMarks{
static int total(int[] m){int t=0;for(int x:m)t+=x;return t;}
static double average(int[] m){return total(m)/5.0;}
static String status(int[] m){for(int x:m) if(x<35) return "Fail"; return "Pass";}
public static void main(String[] args){Scanner sc=new Scanner(System.in);int[] m=new int[5];for(int i=0;i<5;i++) m[i]=sc.nextInt();System.out.println("Total="+total(m));System.out.println("Average="+average(m));System.out.println(status(m));}
}