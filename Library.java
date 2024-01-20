package LibraryManagementSystem;

import java.util.ArrayList;
public class Library {
     
    public ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getBookByTitle(String title) {
        
        for (Book book : books) {
           String s=book.getTitle(); 
          
           if (s.equals(title)) {
               return book;
            }
        }
       
      return null;
    }

    public Book getBookByAuthor(String author) {
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public Book getBookByIsbnForBorrow(int isbn) {
        for (Book book : this.books) {
            if (book.getIsbn()==isbn) {
                if(!book.isBorrowed()){
                System.out.println("Title: \""+book.getTitle()+"\"."+"\nAuthor: "+book.getAuthor()+".\nThankyou visit again.");
                System.out.println();
                return book;}
                else{
                    System.out.println("The book is already borrowed.You can acquire it when it's available");
                }
            }
        }
        return null;
    }
    public Book getBookByIsbnForReturn(int isbn) {
        for (Book book : this.books) {
            if (book.getIsbn()==isbn) {
                if(book.isBorrowed()){
                System.out.println("Title: \""+book.getTitle()+"\"."+"\nAuthor: "+book.getAuthor()+".\nThankyou visit again.");
                System.out.println();
                return book;}
                else{
                    System.out.println("Sorry it seems you entered the wrong number.");
                }
            }
        }
        return null;
    }
    public void allBooks(){
        int i=1;
        for(Book b:books){
            if(b.isBorrowed()){
            System.out.println("------------------------------------");

            System.out.println("Id "+i+":");
            System.out.println("Title: \""+b.getTitle()+"\"."+"\nAuthor: "+b.getAuthor()+".\nIt is not available.");
            System.out.println("------------------------------------");
            System.out.println();
            i++;
        }
            else{
                System.out.println("------------------------------------");
            System.out.println("Id "+i+":");
            System.out.println("Title: \""+b.getTitle()+"\"."+"\nAuthor: "+b.getAuthor()+".\nIt is available.");
            System.out.println("------------------------------------");
            System.out.println();
            i++;
            }
        }
    }
   
}