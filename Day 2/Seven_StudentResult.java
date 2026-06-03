import java.util.*;
public class Seven_StudentResult{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5,sum=0;
        boolean pass=true;

        for(int i=0;i<n;i++){
            int mark=sc.nextInt();
            if(mark<35) pass=false;
            sum+=mark;
        }

        double avg=sum/5.0;

        if(pass && avg>=50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}