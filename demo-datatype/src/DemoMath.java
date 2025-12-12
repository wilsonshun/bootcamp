public class DemoMath {

    // main + Enter 
    public static void main(String[] args) {
        //byte, short, int, long
        //float, double
        //char, boolean 
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
        long k = 3 * 100L;
        //int t = 3 * 100L; // int * long -> Long, cannot assign into an int box

        //byte -> short -> int -> long -> float -> double 
        float f1 = 10L; // special case
        byte b10 = 9; 
        short s10 = 9;
        // ! Special Case: byte + short -> int 
        // short s20 = b10 + s10
        int s20 = b10 + s10; // OK

        int result = 10/3;
        System.out.println(result); //3

        double englishScore = 87; 
        // int englishScore = 87;
        int mathScore = 72; 
        int historyScore = 34; 

        // Step 1: (int + int + int) / int -> int (answer: 64)
        // Step 2: assign int value 64 into a double box -> 64.0 
        double averageScore = (double) (englishScore + mathScore + historyScore) / 3;  
        //  double averageScore = (englishScore + mathScore + historyScore) / 3.0;  
        System.out.println(averageScore); //64.33333

        int count = 0; 
        //System.out.println(10 / count); // error

        //0.1 + 0.2
        System.out.println(0.1 + 0.2); // 0.30000000000004
        double d1 = 0.1; 
        double d2 = 0.2; 
        double d3 = d1 + d2; 
        System.out.println(d3); //0.30000000004
        System.out.println(0.2 + 0.2); // 0.4

        // ! Never use double variable (變量) for Math Operations (+,-,*,/)
        // ! Solution: BigDecimal  

        // ! Overflow (No error)
        int i10 = 2_100_000_000; 
        int i11 = i10 + 100_000_000; 
        System.out.println(i11); // -2094967296
        // ! For primitive (int, long), it will not be error after the math operation even if it exceeds the upper / lower limit.

        //long l10 = i10 + 100_000_000; 
        //System.out.println(l10); // -2094967296

        // ! Step 1: int + long -> long (No Overflow)
        // ! Step 2: assign long value into long variable 
        long l10 = i10 + 100_000_000L; 
        System.out.println(l10); // 2200000000

        // char -> int (ASCII)
        int v = 97; 
        char n = 'a'; 
        
        int v2 = n; 
        System.out.println(v2); // 97

        // A
        char n2 = 'A'; 
        int v3 = n2; 
        System.out.println(v3); // 65

        long l20 = 3; 
        int v4 = '你'; 
        System.out.println(v4); // 20320

        int v5 = 20320; 
        // ! Cannot assign higher level value into a lower level type 
        //char c20 = v5; 

        int value = 'A'; // char -> int 

        long l30 = 2_200_000_000L; 
        //int v10 = l30; 
        int v10 = (int)l30; //自負盈虧
        System.out.println(v10); // -2094967296

        // 65 -> A
        int v11 = 65; 
        char c80 = (char) v11;
        System.out.println(c80); // A 

        int v12 = 6560; 
        char c81 = (char) v12; 
        System.out.println(c81); // T (65620 - 65535)

        }
}