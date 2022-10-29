import java.util.ArrayList;

public class main 
{
    public static void main(String[] args)
    {
        
        BookDatabase Biblotheca = new BookDatabase("Books.txt");
        Biblotheca.readFromFile();
        Book book = new Book("P2","Pride and prejudice", "Jane Austen", "Publisher",1);
        Book book2 = new Book("P3","Pride and Evil", " Jane 7amada", "Publisher", 1);
        Biblotheca.insertRecord(book);
        Biblotheca.insertRecord(book2);
        Biblotheca.insertRecord(book);
        Biblotheca.saveToFile();
        
        System.out.println("----------------------------------------------------------------");   
        ArrayList<Book> books = new ArrayList<Book>();
        books = Biblotheca.returnAllRecords();
        int size = Biblotheca.returnAllRecords().size();
        Book arr[] = new Book[size];
        
      
    }    
}
