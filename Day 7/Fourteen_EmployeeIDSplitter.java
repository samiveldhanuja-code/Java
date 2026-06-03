import java.util.*;
public class Fourteen_EmployeeIDSplitter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        System.out.println("Alphabetic Part: "+id.replaceAll("[0-9]",""));
        System.out.println("Numeric Part: "+id.replaceAll("[^0-9]",""));
    }
}