package CWH_OOPS.Exc;
class Library{
    String[] books;
    int noBooks;

    // public int[][]issue_book;
    public void addBook(){

    }Library(){
        this.books=new String[100];
        this.noBooks=0;
    }

    public void addBook(String books){
        this.books[noBooks]=books;
        noBooks++;
        System.out.println(books+"->Book has been addded..!");

    }
    public void issueBook(String books){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==books){
                System.out.println("This book is issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("book not found");
    

    }
    public void ReturnBook(String books){
        addBook(books);


    }
    public void showAvailableBooks(){
        System.out.println("Available Books->");
        for(String e:this.books){
            if(e==null){
                continue;
            }
            System.out.println("*"+e);
            // break;
        }
    }
}
public class CWH_51_E4 {
    public static void main(String[] args) {
        
        // you have to implement a library using //!java class library
        //!Methods    : addBook;issueBook;ReturnBook;showAvailableBooks
        //!Properties : array to store available books{
        //!          : array to issue the book
        //!}
        Library uniLibrary = new Library();
        System.out.println("************************************");
        uniLibrary.addBook("Rich Dad Poor Dad");
        uniLibrary.addBook("Learn C");
        uniLibrary.addBook("Learn Java");
        uniLibrary.addBook("Learn C++");
        System.out.println("************************************");
        uniLibrary.showAvailableBooks();
        uniLibrary.issueBook("Learn C++");
        uniLibrary.showAvailableBooks();
        uniLibrary.ReturnBook("Learn C++");
        uniLibrary.showAvailableBooks();


        
        
    }
}
