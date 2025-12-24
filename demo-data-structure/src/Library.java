import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private static int bookIdCount = 0; 
    // BookType -> a list of books
    // BookID -> Book 
    private Map<Integer, Book> bookMap1;  
    private Map<BookType, List<Book>> bookMap2; 

public Library() {
    this.bookMap1 = new HashMap<>(); 
    this.bookMap2 = new HashMap<>(); 
}

public void add(BookType booktype, Book book) {
    int bookId = ++bookIdCount; 
    book.setId(bookId); 
    List<Book> booklist = this.bookMap2.getOrDefault(bookType, new ArrayList<>());  
    booklist.add(book); 
    bookMap1.put(bookId, book); 
}

public Book search(int bookId) {
    return this.bookMap1.get(bookId); 
}

public List<Book> search(BookType booktype) {
    return this.bookMap2.get(bookType); 
}

public static enum BookType {
    MATH, HISTORY, ENGLISH,; 
}

    public static class Book {
        private Integer id; 
        private String name; 

        public Book(String name) {
            this.name = name; 
        }

        public String getName() {
            return this.name; 
        }

        public void setId(Integer id) {
            this.id = id; 
        }        

        @Override
        public String toString() {
            return "Book(" // 
                + "id" + this.id // 
                ",name=" + this.name
        }

        public static void main(String[] args) {
            Library l1 = new Library(); 
            l1.add(BookType.HISTORY,new Book("ABC")); 
            l1.add(BookType)
        }
    }
}
