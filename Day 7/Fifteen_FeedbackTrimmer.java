import java.util.*;
public class Fifteen_FeedbackTrimmer{
    static String trimFeedback(String feedback){
        return feedback.length()>100?feedback.substring(0,100)+"...":feedback;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(trimFeedback(sc.nextLine()));
    }
}