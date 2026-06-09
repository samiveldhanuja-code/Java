import java.util.*;
class Student{String name;int marks;Student(String n,int m){name=n;marks=m;}}
public class Problem1_StudentRanking{
public static void main(String[] args){
ArrayList<Student> list=new ArrayList<>();
list.add(new Student("A",90)); list.add(new Student("B",75)); list.add(new Student("C",95));
list.sort((x,y)->y.marks-x.marks);
for(Student s:list) System.out.println(s.name+" "+s.marks);
}}