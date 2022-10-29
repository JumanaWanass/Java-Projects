import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class BookDatabase
{
    // Class attributes
    private String filename;
    private ArrayList<Book> records = new ArrayList<Book>();

    public BookDatabase(String filename)   // Class constructor
    {
        this.filename = filename;
    }

    /*Function reads file and prints all of its contents. It also appends the book user to the
     array list called records */

    public void readFromFile() 
    {
        try{
            File file = new File(filename);
            String line = null;
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
              line = sc.nextLine();
              System.out.println(line);
              Book book = createRecordFrom(line);
              insertRecord(book);
            
            } 
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
       
    }
    
    /*Function recieves Librarian data comma separated and retruns a LibrarianUser object */

    public Book createRecordFrom(String line)
    {
      String[] book_data = line.split(",");
      int bookId = Integer.parseInt(book_data[4]);
      Book new_book = new Book(book_data[0], book_data[1], book_data[2], book_data[3],bookId);
      return new_book;
    }

    public ArrayList<Book> returnAllRecords()
    {
        return records;
    }
    
    /*Function checks if provided ID exists in the arraylist */

    public boolean contains(String key)
    {
      for(Book book:this.records)
      {
        if(book.getSearchKey().equals(key))
          return true;       
      }
      return false;
    }

    /*Returns an object of type Librarianuser if it has provided ID */

    public Book getRecord(String key)
    {
      for(Book book:this.records)
      {
        if(book.getSearchKey().equals(key))
          return book;
      }
      return null;
    }

    public void insertRecord(Book book)
    {

      if(contains(book.getSearchKey()))
        System.out.println("Book already exists in reord with same ID. ");

      else  
        this.records.add(book);
        
    }
    /*Searches for a record with given key and deletes object from list */

    public void deleteRecord(String key)
    {
      for(Book book:this.records)
      {
        if(book.getSearchKey().equals(key))
        {
            Boolean flag = this.records.remove(book);
            if (flag)
              System.out.println("Record Deleted");
            break;
        }
      }
    }
    

    public void saveToFile()
    {
        try
        {
          File file = new File(filename);
          if(file.delete())
          {
              FileWriter myWriter = new FileWriter(this.filename);
              for(Book book:this.records)
              {
                  myWriter.write(book.lineRepresentation());
                  myWriter.write("\n");
              }
              myWriter.close();     
          } 
          else
              System.out.println("Delete error occurred.");
  
        }
            catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
