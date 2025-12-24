public class DemoEnum {

    public static void main(String[] args) {
        Ball b1 = Ball.ofRed(); 
        Ball b2 = Ball.ofRed();  
        
        // ! Always use "==" to check enum value, 冇例外
        if (b1.getColor() == Color.Red) {
            System.out.println("Ball b1 is Red.");
        }

        System.out.println(b1.equals(b2)); // false

    }
}
