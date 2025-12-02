public class DemoPrimitive {
    public static void main(String[] args) {
        // integer
        // from right to left (put value 3 into a box x)
        // ! Declaration (Declare the type of x)
        // ! Assignment (Assign value 3 into x)
            int x = 3;
            System.out.println(x); // 3
        // ! Reassignment 
            x = 100; 
            System.out.println(x); // 100
            x = -200;
            System.out.println(x); // -200

            // Number with decimal 
            double y = 3.14159; 
            double z = 3.0;

            // ! Assign 10 (int) into double box, convert 10 into 10.0
            double a = 10; // still okay for integer 

            System.out.println(y); //3.14159 
            System.out.println(z); //3.0 
            System.out.println(a); //10.0 (not 10)

            // ! Cannot assign decimal number into a box 
            //int k = 10.5;

            // char (character) 
            char h = 'e'; 
            System.out.println(h); //e

            // reassign value k 
            h = 'k'; //k 
            // !sysout 
            System.out.println(h);

            h = '鄭';//鄭 
            System.out.println(h);

            //boolean; cannot start with numbers; must start with a Character; 駝峰
            boolean isElderly = true; 
            boolean isMarried = false; 
            boolean isAdult = true; 

            System.out.println("isMarried=" + isMarried);

            // 整數 (int, byte, short, long)
            // Range: -128 to 127
            byte b1 = 127;
            // byte b2 = 128; // out of range 
            // byte b3 = -129; // out of range 

            // ! 32767 is an int value 
            // ! There is no byte value and short value in Java 
            // Range: -32678 to 32767 
            short s1 = 32767; 
            //short s2 = 32768; 
            short s3 = -32768; // OK

            // ! In real life, by default we use int for integer; 
            int i1 = 2_100_000_000;
            //int i2 = 2_200_000_000;

            // long -> 2^63 
            // Assign int value into long box 
            long l1 = 1270;
            // Assign long value into int box (Not okay) 
            //int i7 = 1270L; 

            // Decimal Number (float, double)
            // 3.5 (double value) -> float box (unsafe)
            // float f1 = 3.5; 

            double d1 = 3.5; 
            //float f1 = d1; // unsafe

            // ! 3.5f is a float value 
            // ! 3.5 is a double value
            // ! 3.5d is a double value 
            // Assign float value into a float box 
            float f2 = 3.5f; 
            // ! assign float value into a double box 
            double d2 = 3.5f; 
           
            // Declaration
            int j; 
            //System.out.println(j); // ! You cannot read the box without assigning value (Compile time)
            // Assign 
            j = 10; 
            System.out.println(j); // 10
    
    }
}
