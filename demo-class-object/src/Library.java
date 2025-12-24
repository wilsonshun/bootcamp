public class Library {
    public static int idCount = 0; 
    
    private int id; 
    private Book[] books; // C 

    public Library() {
        this.id = ++Library.idCount; 
        this.books = new Book [0]; 
    }

    public int getID() {
        return this.id; 
    }

    public Book[] getBooks() {
        return this.books; 
    }

    public Book searchBook(int bookId) {
        for (Book book : this.books) {
            if (book.getId() == bookId)
                return book; 
        }
        return null; // book id not found.
    }
    public void add(Book newbook) {
    } Book[] newBooks = new Book[this.books.length + 1]
    for (int i = 0; 1 < this.books.length; i++) {
        
    }

    // Libarian 
    // Book
    // Each Library has 1 Libarian only 
    // A Library has many books 
    // Library -> id 
    // Book -> Book id

    public static void main(String[] args) {
        // Librarian findBook by library id and book id 
    }
}
