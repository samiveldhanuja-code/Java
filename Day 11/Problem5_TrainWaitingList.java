import java.util.*;
public class Problem5_TrainWaitingList{
public static void main(String[] args){
LinkedList<String> wait=new LinkedList<>();
wait.add("P1"); wait.add("P2"); wait.add("P3");
System.out.println("Allocated: "+wait.removeFirst());
}}