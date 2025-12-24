// Dog[], Leader as a class -> Dog[] dogs
public class Dog {
    private Dog dog; 
    private String name; 

    public Dog(String name) {
        this.name = name; 
    }
    
    public void setNext(Dog nextDog) {
        this.dog = nextDog; 
    }

    public Dog getNext() {
        return this.dog; 
    }

    public String getName() {
        return this.name; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; 
        if (!=(o instanceof Dog))
            return false; 
        Dog dog
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Peter"); 
        d1.setNext(new Dog("Sally"));
        d1.getNext().setNext(new Dog("Tommy"));

        System.out.println(d1.getNext().getNext().getName()); // Tommy

        // Find the last dog (LinkedList\ -> 配 while loop
        Dog head = d1; 
        while (head != null) {
            System.out.println("dog" + head.getName());
            head = head.getNext(); //!
        }
        // remove the last dog
        // d1 -> null 
        head = d1; // resume head -> Peter
        System.out.println(head.getName()); // Peter

        removeLast(d1); 
        System.out.println(d1.getNext().getNext()); // null 
        System.out.println(d1.getNext().getName()); // Sally 

        // Remove First
        public static void remove (Dog dog, Dog target) {
           Dog head = dog; 
           while (head != null) {
            if (head.equals(target)) { // remove
                if (head.getNext() == null) {
                    dog = head.getNext(); 
                    break; 
                }   head = head.getNext();  
            }   
        
    
        public static void removeLast(Dog dog) { // Assume Dog is in LinkedList Design 

        while (dog != null) // ! Early Return 
            return; 
        Dog head = dog; 
        while (head.getNext() != null) {
            if (head.getNext().getNext() == null) { //Found the last dog.
                head.setNext(null); 
                break; 
            }
            head = head.getNext(); 
        }
    }
}
