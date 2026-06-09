import java.util.*;
public class Problem4_TextEditorUndo{
public static void main(String[] args){
Stack<String> undo=new Stack<>();
undo.push("Hello"); undo.push("Hello World");
System.out.println("Undo: "+undo.pop());
}}