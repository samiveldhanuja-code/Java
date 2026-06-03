import java.util.*;
public class Eight_EvenOddDifference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), even=0, odd=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0) even+=a[i];
            else odd+=a[i];
        }
        System.out.println("Difference = "+(even-odd));
    }
}