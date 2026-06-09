import java.util.*;
public class Problem3_BrowserHistory{
public static void main(String[] args){
Stack<String> st=new Stack<>();
st.push("Google"); st.push("YouTube"); st.push("OpenAI");
System.out.println("Back to: "+st.pop());
}}