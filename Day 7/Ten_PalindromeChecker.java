import java.util.*;
public class Ten_PalindromeChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String rev=new StringBuilder(word).reverse().toString();
        System.out.println(word.equalsIgnoreCase(rev)?"Palindrome":"Not Palindrome");
    }
}