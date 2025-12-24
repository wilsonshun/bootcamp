public class Animal {
    private String name; 
    private int age; 

    public Animal() {
        System.out.println("I am Animal Constructor");
    }

    public Animal(String name, int age) {
        System.out.println("I am Animal Constructor 2");
        this.name = name; 
        this.age = age; 
    }

    public String getName() {
        System.out.println("Animal getName...");
        return this.name; 
    }
}
