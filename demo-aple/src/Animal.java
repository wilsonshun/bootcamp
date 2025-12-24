// ! abstract (抽象)

// ! abstract class 
// 1. cannot be used for creating objects
// 2. treat as Parent Class 
// 3. has attributes (common attributes)
// 4. Abstract method 

public abstract class Animal { // Parent Class 
    // ! Cat extends Animal, Animal implicitly extends Object
    private String name; 
    private int age; 

    public Animal() {
        System.out.println("I am Animal empty constructor");
    }

    public Animal(String name, int age) {
        System.out.println("I am Animal constructor 2");
        this.name = name; 
        this.age = age; 
    }

    public String getName() {
        System.out.println("Animal getName...");
        return this.name; 
    }

    public int getAge() {
        return this.age; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public void setAge(int age) {
        this.age = age; 
    }

    public static void main(String[] args) {
        //   
        // new Animal(); 
        }
    
    public void eat() {
        System.out.println("Animal eat ...");
    }
    
    @Override
  public String toString() {
    return "Animal(" //
        + "name=" + this.name //
        + ",age=" + this.age //
        + ")";

    }
}
