public class Book {
                                      // Static variable
    static int totalBook;
                                      // Non Static variable
    String author;
    String title;
    String isbn;
    boolean isBorrowed;
                                       // Static block
    static {
        totalBook = 0;
    }
    {
        totalBook++;
    }
                                      // Constructor 1
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
                                        // Constructor 2
    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }
    static int totalBook() {
        return totalBook;
    }
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title + " book");
        }
    }
    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoy this book");
        } else {
            System.out.println("This book already in the library");
        }
    }

    public static void main(String[] args) {
        Book english = new Book("1", "Language", "Hasin");
        Book math = new Book("2");
        System.out.println(Book.totalBook());
        english.borrowBook();
        math.borrowBook();
        english.borrowBook();
        english.returnBook();
        english.returnBook(); //
       
    }

}
