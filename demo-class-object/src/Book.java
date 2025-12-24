public class Book {
    public static int idCount = 0; 
    private int id; 

    public Book() {
        this.id = ++idCount; 
    }
 
public int getId() {
        return this.id; 
    
    }
}
