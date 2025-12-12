public class DemoWrapper {
    public static void main(String[] args) {
        // Wrapper Class 
        // 8 Primitives -> 8 Wrapper Classes 
        
        // x is a variable; 
        int x = 3; 

        // Box (Object) 
        // x2 is an object 
        Integer x2 = 3; 

        // Same: + operation 
        x = x + 3; 
        x2 = x2 + 3; 

        // difference
        // range of x: -2.1b -> 2.1b
        // range of x2: -2.1b -> 2.1b and NULL 
        // x = null; 
        // x2 = x2 + 3; // java.lang.NullPointerException

        // 
        byte b1 = 4; 
        Byte b2 = 4; 
    
        // 
        short s1 = 5; 
        Short s2 = 5; 

        // 
        long l1 = 6L; 
        // ! Java does not allow multi conversions
        // Long l2 = 6;   // 6 (int) -> (long) -> (Long). Java cannot do 2 conversions 
        Long L2 = 6L; // 6 (long) -> (Long)

        // 
        float f1 = 9.5f; 
        Float f2 = 9.5f; 

        // 
        double d1 = 5.5; 
        Double d2 = 5.5; 

        // 
        char c1 = 'c'; 
        Character c2 = 'c'; 

        System.out.println(c1 + 2); // 101
        System.out.println(c2 + 2); // 101

        // 
        boolean bl1 = true; 
        Boolean Bl2 = true; 

        // auto-box
        int x10 = 10; 
        Integer x20 = x10; // auto-box
        // ! Never use >, <, >=, <=, == for Wrapper Class
        System.out.println(x20.equals(20)); // true
        System.out.println(x20.compareTo(10)); // 0 
        System.out.println(x20.compareTo(8)); // 1
        System.out.println(x20.compareTo(12)); // -1

        // ! Works but don't use this
        System.out.println(x20 > 8); // true
        System.out.println(x20 > 12); // false

        // ! OK to use +, -, *, / for Integer

        if (x20.compareTo(6) > 0) {
            System.out.println("x20 > 6.");
        }
        int x30 = x20; // ! un-box (auto)
        System.out.println(x30); // 10
    }
}
