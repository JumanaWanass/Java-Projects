import java.time.LocalDate;
import java.time.Duration;

public class LibrarianRole {
    private BookDatabase bookDatabase ;
    private StudentBookDatabase sBDatabase ;
     public LibrarianRole(String filename, BookDatabase bookDatabase, StudentBookDatabase sBDatabase){
        this.bookDatabase = bookDatabase;
        this.sBDatabase = sBDatabase;
     }

     public void addBook(String id, String title, String authorName, String publisherName, int quantity){
        Book book = new Book(id, title, authorName, publisherName, quantity);
        bookDatabase.insertRecord(book);
        bookDatabase.saveToFile();
     }

     public Book[] getListOfBooks(){
        return bookDatabase.returnAllRecords().toArray(new Book[0]);
     }

     public StudentBook[] getListOfBorrowingOperations(){
        return sBDatabase.returnAllRecords().toArray(new StudentBook[0]);
     }

     public int borrowBook(String studentId, String bookId, LocalDate borrowDate){
        int quantity = bookDatabase.getRecord(bookId).getQuantity();
        String key = studentId + "," + bookId;
        if(quantity == 0)
            return 0;
        else if (sBDatabase.contains(key)){
            return 1;
        }
        else{
            Book b = bookDatabase.getRecord(bookId);
            StudentBook sb = new StudentBook(studentId, bookId, borrowDate);
            b.setQuantity(b.getQuantity() - 1);
            sBDatabase.insertRecord(sb);
            sBDatabase.saveToFile();
            bookDatabase.saveToFile();
            return 2;
        }
     }
     public double returnBook(String studentId, String bookId, LocalDate returnDate){
        Book b = bookDatabase.getRecord(bookId);
        String key = studentId + "," + bookId;
        StudentBook sb = sBDatabase.getRecord(key);
        LocalDate borrowDate = sb.getBorrowDate();
        Duration duration = Duration.between(borrowDate, returnDate);
        b.setQuantity(b.getQuantity() + 1);
        bookDatabase.saveToFile();
        long days = duration.toDays();
        sBDatabase.deleteRecord(key);
        sBDatabase.saveToFile();
        if (days < 7)
            return 0;
        else
            return ((days - 7) * 0.5);

     }

     public void logout(){
        bookDatabase.saveToFile();
        sBDatabase.saveToFile();
     }
}
