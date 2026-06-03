import java.util.*;
public class Six_FileNameExtractor{
    static String extractFileName(String fileName){
        int index=fileName.lastIndexOf('.');
        return (index>0)?fileName.substring(0,index):fileName;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file=sc.nextLine();
        System.out.println("File Name: "+extractFileName(file));
    }
}