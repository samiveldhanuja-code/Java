import java.util.*;
class Patient{String name;int severity;Patient(String n,int s){name=n;severity=s;}}
public class Problem2_HospitalQueue{
public static void main(String[] args){
PriorityQueue<Patient> pq=new PriorityQueue<>((a,b)->b.severity-a.severity);
pq.add(new Patient("Tom",5)); pq.add(new Patient("Sam",9));
while(!pq.isEmpty()) System.out.println(pq.poll().name);
}}