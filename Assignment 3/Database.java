import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

abstract public class Database 
{
    private String filename;
    private ArrayList<Records> records;

    public Database(String filename)   // Class constructor
    {
        this.filename = filename;
        records =  new ArrayList<Records>();
    }
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
              this.insertRecord(createRecordFrom(line));
            
            } 
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }

    }
    public Book createRecordFrom(String line)
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
              for(Records records:this.returnAllRecords())
              {
                  myWriter.write(records.lineRepresentation());
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

     class LibrarianUserDatabase extends Database
    {


    }

     class StudentBookDatabase extends Database
     {

     }

     class BookDatabase  extends Database
     {

     }

}




    

