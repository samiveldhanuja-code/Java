import java.util.*;
public class Eight_ProductCodeCleaner{
    static String cleanCode(String code){ return code.replace("-",""); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(cleanCode(sc.nextLine()));
    }
}