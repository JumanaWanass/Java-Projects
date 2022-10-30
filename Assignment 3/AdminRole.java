import java.util.ArrayList;

public class AdminRole extends LibrarianUserDatabase
{
    private LibrarianUserDatabase database;
    
//creating constructor for admin class with super class to LibrarianUserDataBase class.
    public AdminRole(String filename, LibrarianUserDatabase database) {
        super(filename);
        this.database = database;
    }

//adding new librarian to file named Librarians.txt.
    public void addLibrarian(String librarianId, String name, String email,
    String address, String phoneNumber)
    {
        LibrarianUser new_user = new LibrarianUser(librarianId, name, email, address, phoneNumber);
        database.insertRecord(new_user);
        database.saveToFile();
    }

//get an array of type LibrarianUser from all librarians in Librarians.txt file.
    public LibrarianUser[] getListOfLibrarians()
    { 
        return this.returnAllRecords().toArray(new LibrarianUser[0]);
    }

//remove an librarian from the Librarians.txt file.
    public void removeLibrarian(String key)
    {
        database.deleteRecord(key);
        database.saveToFile();
    }

//writes all unsaved data to Librarians.txt file.
    public void logout()
    {
        database.saveToFile();
    } 
        
    
}
