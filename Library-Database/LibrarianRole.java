import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class LibrarianRole 
{
    private Database bookDatabase ;
    private Database sBDatabase ;

     public LibrarianRole()
     {
        this.sBDatabase = new StudentBookDatabase("StudentBooks.txt");
        this.bookDatabase = new BookDatabase("Books.txt");
        this.sBDatabase.readFromFile();
        this.bookDatabase.readFromFile();
     }

     public void addBook(String id, String title, String authorName, String publisherName, int quantity)
   {
      Book book = new Book(id, title, authorName, publisherName, quantity);
      bookDatabase.insertRecord(book);
      bookDatabase.saveToFile();
   }

   public Book[] getListOfBooks()
   {
      return bookDatabase.returnAllRecords().toArray(new Book[0]);
   }

   public StudentBook[] getListOfBorrowingOperations(){
      return sBDatabase.returnAllRecords().toArray(new StudentBook[0]);
   }

   public int borrowBook(String studentId, String bookId, LocalDate borrowDate)
   {
      Book b = (Book)bookDatabase.getRecord(bookId);
      int quantity = b.getQuantity();

      String key = studentId + "," + bookId;
      
      if (sBDatabase.contains(key))
      {
         return 1;
      }
      else if(quantity == 0)
         return 0;
      else
      {
         StudentBook sb = new StudentBook(studentId, bookId, borrowDate);
         b.setQuantity(b.getQuantity() - 1);
         sBDatabase.insertRecord(sb);
         sBDatabase.saveToFile();
         bookDatabase.saveToFile();
         return 2;
      }
   }
   public double returnBook(String studentId, String bookId, LocalDate returnDate)
   {
      Book b = (Book)bookDatabase.getRecord(bookId);
      String key = studentId + "," + bookId;
      StudentBook sb = (StudentBook)sBDatabase.getRecord(key);
      LocalDate borrowDate = sb.getBorrowDate();
      int days = (int) ChronoUnit.DAYS.between(borrowDate, returnDate);
      b.setQuantity(b.getQuantity() + 1);
      bookDatabase.saveToFile();
      sBDatabase.deleteRecord(key);
      sBDatabase.saveToFile();
      if (days < 7)
         return 0;
      else
         return ((days - 7) * 0.5);
   }

   public void logout()
   {
      bookDatabase.saveToFile();
      sBDatabase.saveToFile();
   }
}