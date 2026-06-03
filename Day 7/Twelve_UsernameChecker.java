import java.util.*;
public class Twelve_UsernameChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();
        System.out.println(username.toLowerCase().contains("admin"));
    }
}