package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      Library library = new Library();
      Members member=new Members();
        member.addMem(new Member("satya","xyz@email.com"));
        Member mem1=new Member("suresh","xyz@email.com");
        member.addMem(mem1);
        member.addMem(new Member("prashanth","xyz@email.com"));
        member.addMem(new Member("dharshith","xyz@email.com"));
    
      
      library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1));
      library.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 2));
      Book book1=new Book("The Lord of the Rings", "J.R.R. Tolkien", 3);
      library.addBook(book1);
      library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 4));
      library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 5));
      library.addBook(new Book("1984", "George Orwell", 6));

     int i;
      System.out.println("Welcome to library");
      System.out.println("------------------------------------");
      while(true){
        System.out.print("Are you a member enter yes/no: ");
        String s=sc.nextLine();
        System.out.println("------------------------------------");
        if("yes".equals(s)){
          System.out.print("Enter your membership id name: ");
          String j=sc.nextLine();
        if(member.findMember(j)){
          i=0;
          break; 
        }
        else{
          System.out.println("It seems your id is not present enter valid id or create new id");
        }      
        }
        if("no".equals(s)){
          System.out.print("Create a membership\nEnter your name: ");
          String name=sc.nextLine();
          System.out.print("\nEnter your Email: ");
          String email=sc.nextLine();
          System.out.println("------------------------------------");

          new Member(name,email);
          i=0;
          break;
        }
      }
            
      
      while(i==0){
      System.out.println("**********************************************************");
      System.out.println("(1)Want a book.");
      System.out.println("(2)Return a book.");
      System.out.println("(3)Exit.");
      System.out.println("(4)See the books you have borrowed.");
      System.out.print("Choose any option from above by entering respective number: ");
      int num=sc.nextInt();
      System.out.println("**********************************************************");
      switch (num) {
          case 1:
          System.out.println("\nSee the list of books available");
          System.out.println("**********************************************************");
          library.allBooks();
          System.out.println("**********************************************************");
         sc.nextLine();
          System.out.print("\nChoose a book which you want by entering its Id:");  

          int nums=sc.nextInt();  
          System.out.println("--------------------------------------------------");
  
          try{
            System.out.println("Id "+nums+" is been borrowed");
          member.borrowBook(library.getBookByIsbnForBorrow(nums));
          }
        catch (Exception e) {
            System.out.println("Enter valid book ID.");
          }
          break;

          case 2:
          System.out.print("Enter the id of the book you want to return: ");
          int nums1=sc.nextInt();
          System.out.println("Id "+nums1+" is been received");
          member.returnBook(library.getBookByIsbnForReturn(nums1));
          break;

          case 3:
          System.out.println("Exited!!");
          i=1;
          break;

          case 4:
          System.out.println("Books you have borrowed\n");
          member.getBorrowedBooks();
          break;

          default:
          System.out.println("Enter appropriate option!!");
          break;
      }
      }
      sc.close();
  }
}