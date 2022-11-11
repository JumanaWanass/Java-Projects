
package backend;

import constants.FileNames;

public class AdminRole 
{
    private Database librarianDatabase; 
    public AdminRole()
    {
        this.librarianDatabase = new LibrarianUserDatabase(constants.FileNames.LIBRARIANS_FILENAME);
        this.librarianDatabase.readFromFile();
    }

//adding new librarian to file named Librarians.txt.

    public void addLibrarian(String librarianId, String name, String email,
    String address, String phoneNumber)
    {
        LibrarianUser new_user = new LibrarianUser(librarianId, name, email, address, phoneNumber);
        if(librarianDatabase.contains(librarianId))
            System.out.println("Already exists");
        else 
        {
            librarianDatabase.insertRecord(new_user);
        }
    }

//get an array of type LibrarianUser from all librarians in Librarians.txt file.
    public LibrarianUser[] getListOfLibrarians()
    { 
        return librarianDatabase.returnAllRecords().toArray(new LibrarianUser[0]);
    }

//remove an librarian from the Librarians.txt file.
    public void removeLibrarian(String key)
    {
        librarianDatabase.deleteRecord(key);
        //librarianDatabase.saveToFile();
    }

//writes all unsaved data to Librarians.txt file.
    public void logout()
    {
        librarianDatabase.saveToFile();
    } 
    
}
