package LibraryManagementSystem;
public class Book {

    private String title;
    private String author;
    private int isbn;
    private boolean isBorrowed;
  public Book(){}
    public Book(String title, String author, int i) {
        this.title = title;
        this.author = author;
        this.isbn = i;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
