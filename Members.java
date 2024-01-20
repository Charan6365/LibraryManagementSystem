package LibraryManagementSystem;

import java.util.ArrayList;
class Member {
    
    
    private String name;
    private String email;
    
   

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
       
        
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
   

   
}

public class Members{
    Library lib=new Library();
    private ArrayList<Member> Members;
    private ArrayList<Book> borrowedBooks;
    public Members(){
        this.Members = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }
    public void addMem(Member members) {
        this.Members.add(members);
    }
    public void getBorrowedBooks() {
        for(Book b:this.borrowedBooks){
            System.out.println("Id ("+b.getIsbn()+")");
            System.out.println("Title: \""+b.getTitle()+"\"."+"\nAuthor: "+b.getAuthor()+".");
        }
    }

    public void borrowBook(Book book) {
        
           this.borrowedBooks.add(book);
            (book).setBorrowed(true);
  
        
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        book.setBorrowed(false);
    }


    

    public boolean findMember(String j){
        for(Member mem:Members){
            if(j.equals(mem.getName())){
               return true; 
            }
        }
        return false;
    }

}

 
