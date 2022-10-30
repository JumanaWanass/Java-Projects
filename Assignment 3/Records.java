import java.time.LocalDate;
public interface Records  
{
    public String getSearchKey();
    public String lineRepresentation();

}

class LibrarianUser implements Records
{
        private String librarianId;
        private String Name;
        private String Email;
        private String Address;
        private String PhoneNumber;

        public LibrarianUser(String librarianId, String name, String email, String address, String phoneNumber)
        {   
            this.librarianId = librarianId;
            this.Name = name;
            this.Email = email;
            this.Address = address;
            this.PhoneNumber = phoneNumber;
        }
        public String lineRepresentation()
        {
            String LibrarianData = this.librarianId + "," + this.Name + "," + this.Email + "," + this.Address + "," + this.PhoneNumber + "\n";
            return LibrarianData;
        }
        public String getSearchKey()
        {
            return this.librarianId;
        }
        
    }

class Book implements Records
{
    private String bookId;
    private String title;
    private String authorName;
    private String publisherName;
    private int quantity = 0;
    public Book(String bookId, String title, String authorName, String publisherName, int quantity)
    {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.quantity = quantity;
    }   
    public int getQuantity()
    {
        return this.quantity;
    }
    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }
    public String lineRepresentation() //returns the data of the book comma separated.
    {
        String BookData = this.bookId + "," + this.title + "," + this.authorName + "," +
        this.publisherName + "," + this.quantity;
        return BookData;
    }
    public String getSearchKey()
    {
        return this.bookId;
    }

}

class StudentBook implements Records
{
    private String studentId;
    private String bookId;
    private LocalDate borrowDate ;
    
    public StudentBook(String studentId, String bookId, LocalDate borrowDate)
    {
        this.studentId = studentId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getBookId() {
        return this.bookId;
    }

    public LocalDate getBorrowDate() {
        return this.borrowDate;
    }
    
    public String lineRepresentation() {
        String line = this.studentId + "," + this.bookId + "," + this.borrowDate;
        return line;
    }

    public String getSearchKey(){
        String searchKey = this.studentId + "," + this.bookId;
        return searchKey;
    }
}
