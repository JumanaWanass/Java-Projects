
package backend;


public class Book implements Records {
    
    private String bookId;
    private String title;
    private String authorName;
    private String publisherName;
    private int quantity = 0;

    public Book(String bookId, String title, String authorName, String publisherName,int quantity)
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

    @Override
    public String lineRepresentation() //returns the data of the book comma separated.
    {
        String BookData = this.bookId + "," + this.title + "," + 
        this.authorName + "," + this.publisherName + "," + this.quantity + "\n";
        return BookData;
    }
    
    @Override
    public String getSearchKey()
    {
        return this.bookId;
    }
}
