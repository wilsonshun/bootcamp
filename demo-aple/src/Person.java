public class Person extends Human {
    public static final int FLY_SPEED; 
public static final Superman leader; 

// ! Static Block 
static {
    System.out.println("Static Block ...");
    SUPERMAN_FLY_SPEED = 100; 
    leader = new Superman("Ben"); 
}
    public static void main(String[] args) {
        System.out.println((Person.SUPERMAN_FLY_SPEED)); // 100
        System.out.println(Person.leader.getName()); // Ben 
    }
}
