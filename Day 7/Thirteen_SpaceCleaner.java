import java.util.*;
public class Thirteen_SpaceCleaner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String msg=sc.nextLine();
        System.out.println(msg.trim().replaceAll("\\s+"," "));
    }
}