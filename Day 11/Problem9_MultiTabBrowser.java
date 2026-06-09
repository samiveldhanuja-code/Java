import java.util.*;
public class Problem9_MultiTabBrowser{
public static void main(String[] args){
LinkedList<String> tabs=new LinkedList<>();
Stack<String> history=new Stack<>();
tabs.add("Tab1"); history.push("Page1"); history.push("Page2");
System.out.println("Back: "+history.pop());
}}