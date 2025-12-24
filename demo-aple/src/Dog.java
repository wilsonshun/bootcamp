// ! Child Class
// ! Child Class constructor always calls parent constructor
public class Dog extends Animal {

    // Constructor (name, age) 
    public Dog() {
        // super(); // calling parent empty constructor 
    }

    public Dog(String name, int age) {
        // super(); // calling parent empty constructor // 唔寫即係寫咗
        super(name, age); // calling another constructor
    }

    // ! implicitly inherit parent's all instance methods
    @Override // ! check if the parent has this method 
    // ! 當唔滿意 Parent 表現時就用 Override
    public String getName() {
        System.out.println("Dog getName...");
        // ! super
        return super.getName(); 
    }

    // sound()
    // eat()
        @Override
    public void eat() {
        System.out.println("Dog is eating ..");
    }

    // No. of Objects: this vs o
    // ! 標準寫法要背
    @Override
    public boolean equals(Object o) {
        // ! Step 1: 
        if (o == this) // same java object in memory
            return true;
        // ! Step 2 
        if (!(o instanceof Dog)) 
            return false; 
        Dog dog = (Dog) o; // supposedly risky but no rish after checking instanceof 
        return dog.getName().equals(super.getName()) // ! String shall use equals
           && dog.getAge() == super.getAge(); // ! Int shall use ==
    }

    @Override
    public int hashCode() {
        // ! generate an int value based on given value(s)
        return Objects.hash(super.getName(), super.getAge()); 
    }

    @Override
    public String toString() {
        return "Dog(" //
        + super.toString() // 
        + ")"; 
    }

    public static void main(String[] args) {
        Dog d1 = new Dog(); 
        d1.setName("John"); 
        d1.setAge(4); 
        System.out.println(d1.getName()); // John
        System.out.println(d1.getAge()); // 4
    
        // Cat
        Cat c1 = new Cat(); 
        c1.setAge(3); 
        c1.setHair("RED"); 
        c1.setName("Jenny"); 
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.getHair());

        // Dog
        Dog d2 = new Dog(); 
        d2.setName("Peter"); 
        d2.setAge(7); 
        System.out.println(d1.getName()); // John
        System.out.println(d2.getName()); // Peter
        d2.eat(); // Dog is eating ..
        c1.eat(); // Animal eat ...

        // new Animal(); 
        Dog d3 = new Dog("Steven", 2);
        System.out.println(d3.getName()); // Steven 
    }
}
