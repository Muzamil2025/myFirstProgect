/* Create a book class for a library system 
instance variable (title, author,isbn)
static variable (total book,a counter for the total number of book instances)
instance method (borrowBook(),returnBook())
static method (getTotalBooks(), to get the total)
*/
class Book{

    static int totalBooks;
    String title;
    String author;
    String isbn;
    Boolean isBorrowed;

    static{
        totalBooks=0;
    }{
        totalBooks++;

    }

    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        isBorrowed=false;


    }

    public void borrowBook(){
        if(!isBorrowed){
            System.out.println(title+" borrowed ");
            isBorrowed=true;
        }else{
            System.out.println("Already borrowed");
        }


    }
    public void returnBook(){
        if(isBorrowed){
            System.out.println(title+" returened ");
            isBorrowed=true;
        }else{
            System.out.println("Already available");
        }

    }
    public static int getTotalBooks(){
    
        return totalBooks;


    }
    public static void main(String[] args) {
        Book b1=new Book("chemistry","ali","1234");
        Book b2=new Book("physics","muzamil","6789");
        b1.borrowBook();
        b1.returnBook();

        System.out.println(Book.getTotalBooks());
    }
    

}