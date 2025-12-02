public class DemoMath {

    // main + Enter 
    public static void main(String[] args) {
        // + - * / %
        // % -> The remainder of division
        int remainder = 10 % 3; 
        System.out.println(remainder); // 1

        remainder = 99 % 7; 
        System.out.println(remainder); // 1

        // int
        int a = 7; 
        System.out.println(a + 9); //16
        System.out.println(a - 3); //4
        System.out.println(a * 7); //49 
        System.out.println(a / 7); // 1

        // A + 10 -> 17 (int + int -> int value) 
        // Assign int value (17) into an int box 
        a = a + 10; 
        System.out.println(a); //17

        // Step 1: int + double
        // Step 2: Assign
        int b = 8; 
        System.out.println(b + 3.5d); //11.5
        double r = b + 3.5d;
        
        // Operation between higher level type and lower level type -> Result: Higher level type 
        long k = 3 * 100 L;
        //int t = 3 * 100L; // int * long -> Long, cannot assign into an int box

        //byte -> short -> int -> long -> float -> double 
        float f1 = 10L; // special case
        byte b10 = 9; 
        short s10 = 9;
        // ! Special Case: byte + short -> int 
        // short s20 = b10 + s10
        int s20 = b10 + s10; // OK

        // char -> int
    }
}