public class DemoObject {
    public static void main(String[] args) {
        // Object.class (Memory -> Java Object)

        // String.class ("John" -> "John")
        // String.class author overrides equals()
        
        String s = "hello";
        System.out.println(s.equals("hello")); // true

        Dog d1 = new Dog("Kenny", 1); 
        Dog d2 = new Dog("Kenny", 1); 
        System.out.println(d1.equals(d2)); // false 
        // ! All Java Object implicitly extends Object.class 

        // 三寶 = toString(), equals(), hashCode()
        // ! before override (Java Object in Memory)
        // ! 電腦 object 永遠多過現實世界 objects
        System.out.println(d1.toString()); // Dog@7344699f
        System.out.println(d1.hashCode()); // 1933863327
         System.out.println(d1.hashCode() == d2.hashCode()); // false (before override)

        // ! After override
        System.out.println(d1.equals(d2)); // true (after override) // ! 兩個 java objects 但人類世界係同一隻狗

        System.out.println(d1.hashCode() == d2.hashCode()); // true

        System.out.println(d1); // Dog(Animal(name=Kenny,age=1))


    }
}
