import java.math.BigDecimal;

public class DemoExercise {
    public static void main(String[] args) {
        
    // The first one: 31
    // The second one: 42 
        int x = 31; 
        int y = 42; 
  
        // The sum is 73
        int sum = (int)(x + y);
        System.err.println("The sum is " + sum);

        // The subtraction result is 11
        int subtraction = Math.subtractExact(y, x); 
        System.out.println("The subtraction result = " + subtraction);

        // The another sum result is 130
        byte b1 = 60;
        byte b2 = 70;
        int sum2 = b1 + b2; 
        System.out.println("The another sum result = " + sum2);
    
    // The variable varB is false
    // The variable varC is true
    boolean varB = false; 
    boolean varC = true; 
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // The variable fnumber is -130.2
    // The variable dnumber is -20.5
    float fNumber = -130.2f; 
    double dNumber = -20.5; 
    System.out.println("The variable number f is " + fNumber);
    System.out.println("The variable number d is " + dNumber);

    // The variable remainder is 1
    int a = 7; 
    int b = 3; 
    int remainder = a % b; 
    System.out.println("The variable remainder is " + remainder);

    // ! The variable result is 3
    int e = 7; 
    int o = 8; 
    int p = 4;  
    int q = 2; 
    int result = e - o * q / p; 
    System.out.println("The variable result is " + result );
  
    // JavaQuest 2
    // System.out.println("a is equals to 9");
    // add condition to print "a is between 0 and 8"
    // how about a > 9
    int a1 = 6; 

    if (a1 ==9) {
        System.out.println("a1 equals to 9");
    }   if (a1 >= 0 && a1 <= 8) {
            System.out.println("a1 is beween 0 and 8");
        } if (a1 > 9) {
                System.out.println("a1 is larger than 9");
            }

    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant
    // 3. Not an alphabet
    char ch = '%';
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        System.out.println("This character is a vowel");  
        } else {
            System.out.println("This character " + ch + " is a Consonant");
        }
    if (Character.isAlphabetic(ch)) {
        System.out.println("This is an alphabet");
    }   else if (Character.isDigit(ch))   {
        System.out.println("This is a number");
    }   else {
        System.out.println("This is NOT an alphabet or number");
    }

    // Take salary and years of experience, then calculate bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    // Also, if salary > 100000, reduce bonus by half

    //salary > 100000 reduce bonus by half 
    //a. < 5 -> 2.5 
    //b. 5 - 9 -> 5 
    //c. > 10 -> 10

    //salary < 100000 
    //a. < 5 -> 5 
    //b. 5 - 9 -> 10 
    //c. > 10 -> 20 

    int exp = 12;
    int salary = 110000;
    double percentage = 0; 
    if (salary < 100000) {
        if (exp > 10) {
            percentage += 20; 
        }   if (exp >=5 || exp <= 9) {
            percentage += 10; 
        }   if (exp < 5) {
            percentage += 5; 
        }
    }   else {
        if (exp > 10) {
            percentage += 10; 
        }   if (exp >=5 || exp <= 9) {
            percentage += 5; 
        }   if (exp < 5) {
            percentage += 2.5;
        }  
    }  System.out.println("The bonus % is " + percentage + " %");
        double percertage2 = percentage / 100; 
        System.out.println("The Bonus in percentage is " + percertage2);
        double bonus = salary * percertage2; 
        System.out.println("The bonus calculated is " + "HKD" + bonus);

    // JavaQuest3 
    //**
    // Expected Output:
    // J
    // e
    // 3
    // 9
    // 10
    // ab c
    // VenturenixLAB, Coding
    // 19
    // ren
    // VENTURENIXLAB, JAVA
    // venturenixlab, java
    // V*NTUR*NIXLAB, JAVA!!!
    // */
    
    char j = 'J'; 
    char e3 = 'e'; 
    int i3 = 3; 
    int i9 = 9; 
    int i10 = 10; 
    String abc = "ab c"; 
    String s4 = "VenturenixLAB, Coding"; 
    String text = "3 9 10"; 
    int index3 = text.indexOf("3"); 
    int index9 = text.indexOf("9"); 
    int index10 = text.indexOf("10");
    System.out.println(j);
    System.out.println(e3);
    System.out.println(i3);
    System.out.println(i9);
    System.out.println(i10);
    System.out.println(abc);
    System.out.println(s4);
    System.out.println(index3);
    System.out.println(index9);
    System.out.println(index10);
    System.out.println(s4);

    // JavaQuest 4
    // Print 10 numbers: they must be even and > 0
    // Divisible by 3
    // Divisible by 2 (Search it from 1)

    int count = 0; // how many numbers to be printed 
    int num = 1; // start searching from 1

    while (count < 10){ // need 10 numbers
        if (num % 3 == 0) {     // divisible by 3
            if (num % 2 == 0) {   // divisible by 2
                System.out.println(num + " ");
                count++; 
            }
        }
            num++; // move to next number
    }

    // JavaQuest 5
    // The index of the last character of c is 11 
    String str = "coding bootcamp."; 
    char target = 'c'; 
    int lastIndex = str.lastIndexOf(target); 
    System.out.println("The index of the last character " + target + " is " + lastIndex + ".");

    // JavaQuest 6
    // for loop to print first 15 numbers in Fibonacci Sequence
    int n1 = 0, n2 = 1;     // first two numbers 
    int count2 = 15;         // how many numbers to print 
    System.out.print(n1 + " " + n2);

    for (int i = 2; i < count2; i++) {
        int n3 = n1 + n2; // next number
        System.out.print(" " + n3);
        n1 = n2; 
        n2 = n3; 
    }

    // JavaQuest 7 
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
    int sum10 = 0; 
    for (int i = 0; i < arr.length; i++) {
        sum10 += arr[i]; 
    }
    System.out.println("The Sum is " + sum10);

    // JavaQuest 8 
    public class JavaQuest8 {
    // Write a loop to find the second max number.
    int[] testCase1 = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] testCase2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] testCase3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] testCase4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240
        int secondMax = 0; 
        for (int = 0; int < int.length)
}
}
}