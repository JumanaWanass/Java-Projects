package backend;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalDate;


public abstract class Database // Abstract to only allow subclasses
{
    private String filename;
    private ArrayList<Records> records;

    public Database(String filename)   // Class constructor
    {
        this.filename = filename;
        records =  new ArrayList<Records>();
    }
    /*
        Method is called at the beginning of main to read all the file contents
        and store them in records ArrayList.
    */
    public void readFromFile()
    {
        try{
            File file = new File(filename);
            String line = null;
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
              line = sc.nextLine();
              this.insertRecord(createRecordFrom(line));
            } 
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }

    }
    /*  Since all database subclasses will inherit this superclass, they all have
        createRecordFrom with different implementations and return types.
    */
    public Records createRecordFrom(String line)
    {
      return null;
    }

    public void insertRecord(Records record)
    {
        this.records.add(record);
    }

    public ArrayList<Records> returnAllRecords()
    {
        return this.records;
    }

    public boolean contains(String key)
    {
      for(Records records:this.returnAllRecords())
      {
        if(records.getSearchKey().equals(key))
          return true;       
      }
      return false;
    }
    
    public Records getRecord(String key)
    {
      for(Records records:this.returnAllRecords())
      {
        if(records.getSearchKey().equals(key))
          return records;
      }
      return null;
    }
     
    public void deleteRecord(String key)
    {
      for(Records records:this.returnAllRecords())
      {
        if(records.getSearchKey().equals(key))
        {
            Boolean flag = this.records.remove(records);
            if (flag)
                break;
        }
      }
    }
    /*
      Parses records, gets their respective line representation and writes it
      in file.
    */
    public void saveToFile()
    {
        try
        {
          File file = new File(filename);
          if(file.delete())
          {
              FileWriter myWriter = new FileWriter(this.filename);
              for(Records records:this.returnAllRecords())
              {
                  myWriter.write(records.lineRepresentation());
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


class LibrarianUserDatabase extends Database
{
    public LibrarianUserDatabase(String filename) 
    {
        super(filename);
    }

    public Records createRecordFrom(String line)
    {
        String[] librarian_data = line.split(",");
        LibrarianUser new_lLibrarian = new LibrarianUser(librarian_data[0], 
        librarian_data[1], librarian_data[2], librarian_data[3], librarian_data[4]);
        return new_lLibrarian;
    }

}

class StudentBookDatabase extends Database
{
    public StudentBookDatabase(String filename) 
    {
        super(filename);
    }

    public Records createRecordFrom(String line)
    {
        String[] studentBook_data = line.split(",");
        LocalDate studentBookDate = LocalDate.parse(studentBook_data[2]);
        StudentBook newStudentbook = new StudentBook(studentBook_data[0], 
        studentBook_data[1], studentBookDate);
        return newStudentbook;
    }
}

class BookDatabase  extends Database
{
    public BookDatabase(String filename)   // Class constructor
    {
        super(filename);
    }

    public Records createRecordFrom(String line)
    {
       String[] arr = line.split(",");
       return new Book(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4])); 
    }
    
}




