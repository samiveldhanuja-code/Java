class Book{
    private String title;
    Book(String title){ this.title=title; }
    public String getTitle(){ return title; }
    public void display(){ System.out.println("Book: "+title); }
}
class PrintedBook extends Book{
    PrintedBook(String title){ super(title); }
    public void display(){ System.out.println("Printed Book: "+getTitle()); }
}
class EBook extends Book{
    EBook(String title){ super(title); }
    public void display(){ System.out.println("EBook: "+getTitle()); }
}
public class Problem1_LibraryManagement{
    public static void main(String[] args){
        Book[] b={new PrintedBook("Java"),new EBook("Python")};
        for(Book x:b) x.display();
    }
}