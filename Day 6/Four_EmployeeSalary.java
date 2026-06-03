import java.util.*;
public class Four_EmployeeSalary{
static double hra(double b){return b*0.20;}
static double da(double b){return b*0.10;}
static double gross(double b){return b+hra(b)+da(b);}
public static void main(String[] args){Scanner sc=new Scanner(System.in);double b=sc.nextDouble();System.out.println("Gross Salary="+gross(b));}
}