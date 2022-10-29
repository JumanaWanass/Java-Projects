import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;



public class LibrarianUserDatabase 
{
    // Class attributes
    private String filename;
    private ArrayList<LibrarianUser> records = new ArrayList<LibrarianUser>();

    public LibrarianUserDatabase(String filename)   // Class constructor
     {
        this.filename = filename;
        /*try {
            File file = new File(this.filename + ".txt");
            FileWriter myWriter = new FileWriter(this.filename + ".txt");
            file.createNewFile();
            
            myWriter.write(this.getLibrarianId() + ',' + this.getName() + ',' + this.getEmail() + ',' + this.getAddress() + ',' + this.getPhoneNumber());
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }*/
    }

    /*Function reads file and prints all of its contents. It also appends the librarian user to the
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
              LibrarianUser user = createRecordFrom(line);
              int counter = 0;
              for(LibrarianUser x :records){
                if(x.getLibrarianId().equals(user.getLibrarianId()))
                  counter++;
              }
              if(counter == 0){
                records.add(user);
              }
              
            } 
            sc.close();
        } 
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
    
    /*Function recieves Librarian data comma separated and retruns a LibrarianUser object */

    public LibrarianUser createRecordFrom(String line)
    {
      String[] librarian_data = line.split(",");
      LibrarianUser new_lLibrarian = new LibrarianUser(librarian_data[0], librarian_data[1], librarian_data[2], librarian_data[3], librarian_data[4]);
      return new_lLibrarian;
    }

    public ArrayList<LibrarianUser> returnAllRecords()
    {
        return records;
    }
    
    /*Function checks if provided ID exists in the arraylist */

    public boolean contains(String key)
    {
      for(LibrarianUser user:this.records)
      {
        if(user.getLibrarianId().equals(key))
          return true;       
      }
      return false;
    }

    /*Returns an object of type Librarianuser if it has provided ID */

    public LibrarianUser getRecord(String key)
    {
      for(LibrarianUser user:this.records)
      {
        if(user.getLibrarianId().equals(key))
          return user;
      }
      return null;
    }

    public void insertRecord(LibrarianUser new_user)
    {
      this.records.add(new_user);
    }

    /*Searches for a record with given key and deletes object from list */

    public void deleteRecord(String key)
    {
      for(LibrarianUser user:this.records)
      {
        if(user.getLibrarianId().equals(key))
        {
            Boolean flag = this.records.remove(user);
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
            FileWriter myWriter = new FileWriter(filename);
            for(LibrarianUser user:this.records)
            {
                myWriter.write(user.lineRepresentation());
                
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
