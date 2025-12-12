public class DemoLoop2 {
    public static void main(String[] args) {
        // Q1. print 3 hello
        for (int i = 0; i < 3; i++) {
            System.out.println("hello");
        }

        // Q2. print 1 - 10 
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        // Q3. name = "Mary", print every character of the name. 
        String name = "Mary"; 
        for (int i = 0; i < name.length(); i++){    // 0-
            System.out.println(name.charAt(i));
        }

        // Q4. principal = 1000.0, interest 3% per year, calculate the total amount after 3 years 
        double principal = 1000.0; 
        double interestRate = 3.0; 
        double finalAmount = principal; 
        for (int i - 0; i < 3; i++) {
            finalAmount = finalAmount * (1 + interestRate / 100.0)
        }
        System.out.println("Amount after 3 years =" +finalAmount);

        //from ai
        double principal2 = 1000.0; 
        double rate = 0.03; // 3% per year 
        int years = 3; 

        double simpleInterest = principal2 * rate * years; 
        double total = principal2 + simpleInterest; 

        System.out.println(total);

        // Q5. 1 - 20, sum up all odd numbers and sum up all even numbers separately. Find the product of them. 
        int evenSum = 0; 
        int oddSum = 0; 
        for (int = 1; i <= 20; i++); {
            if (i % 2 ==0) {
                evenSum += i; 
            }   else {
                oddSum += 1; 
            }
        }
        int productOfEvenOdd = oddSum + evenSum; 
        System.out.println(productOfEvenOdd); //11000
        
        //from ai
        int sumOdd = 0; 
        int sumEven = 0; 

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { 
                sumEven += i; // Sum up all even numbers 
            } else {
                sumOdd += i; // Sum up all odd numbers  
            }
        } 
            
        System.out.println(sumOdd);
        System.out.println(sumEven);

        int product = sumOdd * sumEven; 
        System.out.println(product);

        // Q6. result -> "1/2/3/4/5" 
        String result = "";
        for (int = i; i <= 5; i++) {
            result += 1; // String + int -> String
            if (i < 5) {
                result += "/"; 
            }        
        }

        int n = 5; 
        String result = ""; 
        for (int i = 1; i <= n; i++) {
            result += 1; 
            if (i < n) {
                result += "/"; 
            }
        }

        //from ai
        for (int i = 1; i <=5; i++) {
            if (i < 5) {
                System.out.println(i + "/");
            } else {
                System.out.println(i);
            }
        }

        // Q7. llello", count the number of l 
        String s1 = "llello"; 
        char target = 'l'; 
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == target) {
                countTarget++; 
            }
        }
        System.out.println("The Number of " + target + "=" + countTarget);
        
        // from ai
        String word = "llello"; 
        char target = 'l'; 
        int count = 0; 

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
         System.out.println("The letter 'l' within the word 'llello' is " + count);

        // Q8. "HeLLo", count the number of captial letter (upper case letter)
        // ASCII 
        String s2 = "HeLLo"; 
        for (int i = 0; i <= s2.length(); i++) {
            if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') { // ! compare char value (>, <, >=, <=) -> compare int
                countTarget++; 
            }
        }
        System.out.println("The number of Capital Letters =" + countTarget);
        
        // from ai
        String s = "HeLLo"; 
        char target1 = 'L'; 
        int count1 = 0; 
        char target2 = 'H'; 
        int count2 = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target1) {
                count1++;
            } if (s.charAt(i) == target2){
                count2++; 
            }
        }
        System.out.println(count1);
        System.out.println(count2);

        int count3 = count1 + count2;
        System.out.println(count3);
      
        // Q9. print 1 4 9 16 25 ... until 100
        for (int = i; i <= 100; i++) {
            System.out.println(i * i);
        }

        // from ai
         for (int i = 1; i <=10; i++) {
            int square = i * i; 
            System.out.println(square);
        }
    
        // Q10. given a string "apple", count the number of character a, e, i, o, u 
        String s3 = "apple"; 
        for (int = 1; i < s3.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countTarget++; 
            }
        }
        
        // from ai
        String word10 = "apple"; 
        int count10 = 0; 

        for (int i = 0; i < word10.length(); i++) {
            char ch = word10.charAt(i); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count10++; 
            }
        }System.out.println(count10);

        // Q11. given a string "hello", print "hello", "hell", "hel", "he", "h"
        // substring 
        String s4 = "hello"; 
        for (int i = 0; i < s4.length(0); i++) {
            System.out.println(s4.substring(0,s4.length()-i)); // 1st round substring(0,5 - 0 - 1)
        }
        
        // Q12. Given password = "abcd@1234XYZ"
        // Check if the password is valid. Result is boolen
        // 1. Length = 12
        // 2. With at least 1 Capital Letter
        // 3. with at least 1 speical character @#$!.
        String password = "abcd@1234XYZ"; 
        boolean isLengthValid = password.length() >=12; 
        boolean withCapitalLetter = false; 
        boolean withSpecialChar = false; 
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                withCapitalLetter = true; 
                break; 
            }
        }

         for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '@' || password.charAt(i) >= '#' || password.charAt(i) >= '$') || password.charAt(i) >= '!' || password.charAt(i) >= '.' {
                withSpecialChar = true; 
                break; 
                }
        }
        if (withCapitalLetter && withSpecialChar) {
            break;
        }
        boolean isPasswordValid = isLengthValid && withCapitalLetter && withSpecialChar; 
        System.out.println("Is Password Valid? " + isPasswordValid);

        // Given a string s1 = "abc5uk20fs", move all the numbers to another string
        // s1 "a,bc5u!k20fs" -> s2 = 520
        String s5 = "abc5uk20fs"; 
        String newString = ""; 
        for (int i = 1; i < s5.length(); i++) {
            if (s5.charAt(i) >= '0' && s5.charAt(i) <= '9') {
                newString += s5.charAt(i); 
            }
        }
        System.out.println(newString);

        // Encrypt password. "abcd" -> Algorithm: ASCII + 3 -> "defg"
        System.out.println('a' + 3); // char + int -> int
        String origPassword = "abcd"; 
        String encryptedPassword = "";
        for (int i = 1; i < origPassword.length(); i++) {
            encryptedPassword += (char) (origPassword.charAt(i) + 3); 
        }   
        System.out.println("Encrypted Password=" + encrytedPassword);
    }

        
}
