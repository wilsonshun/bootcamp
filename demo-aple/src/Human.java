// Each Human max hp 100 
// sleep -> full hp (100) 
public class Human implements Eatable, Sleepable {
    private static final int MAX_HP = 100; //! constant 
    
    private String name; 
    private int hp; // health point

    public Human(String name) {
        this.name = name; 
        this.hp = 100; 
    }

    // ! cannot be overrode by Child 
    public final void run() {
        System.out.println("Finalized Skill.");
    }

    @Override
    public void eat() {
        // +10, compare max100 
        this.hp = Math.min(Human.MAX_HP, this.hp + 10); //! 邊個細啲攞邊個
    }

    @Override
    public void sleep() {
        this.hp = Human.MAX_HP; 
    }

    public void deductHP(int delta) {
        this.hp = Math.max(0, this.hp - delta); 
    }

    public static void main(String[] args) {
        Human h1 = new Human("Hugo"); // 100 
        h1.eat(); 
        h1.sleep(); 
        // h1.fly()

        Superman s1 = new Superman("Steven"); 
        s1.eat(); 
        s1.sleep(); 
        s1.fly(); 

    }
}
