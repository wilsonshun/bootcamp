//! Interface
// 1. No Attribute
// 2. Methods are abstract
// 3. No Constructor
// 4. static variable? -> YES 
// 5. static method? -> YES

public interface Eatable { // 100% abstraction
    public static String str = "hello"; 
    void eat(); // implicitly abstract

public static int sum(int x, int y) {
    return x + y; 
}

    public static void main(String[] args) {
        System.out.println(Eatable.str); // static variable 
        System.out.println(Eatable.sum(10,3)); // 13
    }
}
