import java.util.*;
public class Seven_CharacterCounter{
    static int countCharacter(String s,char ch){
        int count=0;
        for(int i=0;i<s.length();i++) if(s.charAt(i)==ch) count++;
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        System.out.println(countCharacter(s,ch));
    }
}