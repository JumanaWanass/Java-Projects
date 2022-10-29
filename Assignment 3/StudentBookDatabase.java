import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.io.FileWriter;


public class StudentBookDatabase 
{
    private String filename;
    private ArrayList<StudentBook> records = new ArrayList<StudentBook>();

    public StudentBookDatabase(String filename)   // Class constructor
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
              StudentBook studentBook = createRecordFrom(line);
              insertRecord(studentBook);
            
            } 
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
       
    }
    
    /*Function recieves Librarian data comma separated and retruns a LibrarianUser object */

    public StudentBook createRecordFrom(String line)
    {
      String[] studentBook_data = line.split(",");
      LocalDate studentBookDate = LocalDate.parse(studentBook_data[2]);
      StudentBook newStudentbook = new StudentBook(studentBook_data[0], studentBook_data[1], studentBookDate);
      return newStudentbook;
    }

    public ArrayList<StudentBook> returnAllRecords()
    {
        return records;
    }
    
    /*Function checks if provided ID exists in the arraylist */

    public boolean contains(String key)
    {
      for(StudentBook studentBook:this.records)
      {
        if(studentBook.getSearchKey().equals(key))
          return true;       
      }
      return false;
    }

    /*Returns an object of type Librarianuser if it has provided ID */

    public StudentBook getRecord(String key)
    {
      for(StudentBook studentBook:this.records)
      {
        if(studentBook.getSearchKey().equals(key))
          return studentBook;
      }
      return null;
    }

    public void insertRecord(StudentBook studentBook)
    {

      if(contains(studentBook.getSearchKey()))
        System.out.println("Student Book already exists in reord with same ID. ");

      else  
        this.records.add(studentBook);
        
    }
    /*Searches for a record with given key and deletes object from list */

    public void deleteRecord(String key)
    {
      for(StudentBook studentBook:this.records)
      {
        if(studentBook.getSearchKey().equals(key))
        {
            Boolean flag = this.records.remove(studentBook);
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
              for(StudentBook studentBook:this.records)
              {
                  myWriter.write(studentBook.lineRepresentation());
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
