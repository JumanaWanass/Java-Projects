import java.time.LocalDate;

public class StudentBook implements Records
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

    public String getStudentId() 
    {
        return this.studentId;
    }

    public String getBookId() 
    {
        return this.bookId;
    }

    public LocalDate getBorrowDate() 
    {
        return this.borrowDate;
    }
    
    public String lineRepresentation() 
    {
        String line = this.studentId + "," + this.bookId + "," + this.borrowDate 
        + "\n";
        return line;
    }

    public String getSearchKey()
    {
        String searchKey = this.studentId + "," + this.bookId;
        return searchKey;
    }

}