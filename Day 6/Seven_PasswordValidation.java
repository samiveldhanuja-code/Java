import java.util.*;
public class Seven_PasswordValidation{
static boolean length(String p){return p.length()>=8;}
static boolean hasDigit(String p){for(char c:p.toCharArray()) if(Character.isDigit(c)) return true; return false;}
public static void main(String[] args){Scanner sc=new Scanner(System.in);String p=sc.nextLine();System.out.println("Valid Length="+length(p));System.out.println("Contains Digit="+hasDigit(p));}
}