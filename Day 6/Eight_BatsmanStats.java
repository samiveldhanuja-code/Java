import java.util.*;
public class Eight_BatsmanStats{
static int totalRuns(int[] r){int t=0;for(int x:r)t+=x;return t;}
static double strikeRate(int runs,int balls){return (runs*100.0)/balls;}
public static void main(String[] args){Scanner sc=new Scanner(System.in);int runs=sc.nextInt(),balls=sc.nextInt();System.out.println("Strike Rate="+strikeRate(runs,balls));}
}