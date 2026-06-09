import java.util.*;
class Ticket{String issue;int priority;Ticket(String i,int p){issue=i;priority=p;}}
public class Problem8_CustomerSupport{
public static void main(String[] args){
PriorityQueue<Ticket> pq=new PriorityQueue<>((a,b)->b.priority-a.priority);
pq.add(new Ticket("Payment",3)); pq.add(new Ticket("Login",5));
System.out.println(pq.poll().issue);
}}