import java.util.Arrays;

public class DemoArray3 {
    public static void main(String[] args) {
        // 10, 25, 3, 48, 57
        // print all numbers 

        int[] scores = new int[] {10, 23, 3, 48, 57}; 
        for (int i = 0; i < scores.length; i++); 
        System.out.println(scores[i]);

        // scores 23, 44, 67, 88, 91, 12
        // loop -> print all the even numbers
        int[] arrays2 = {23, 44, 67, 88, 91, 12}; 
            for (int i = 0; i < arrays2.length; i++){
                if (arrays2[i] % 2 == 0) {
                System.out.println(Arrays.toString(arrays2));
                }
            }   

        // Find the median, 34, 78, 12, 89, 45, 99, 23 
        int[] values = new int[] {34, 78, 12, 89, 45, 99, 23}; 
        int medianIdx = values.length / 2; 
        int backup = -1; 

        for (int i = 0; i < medianIdx + 1; i++)  {   // ! control the number of moving max 
            for (int j = 0; j < values.length - i - 1; j++) {   // control the moving max position 
                if (values[j] > values[j + 1])  {
                    backup = values[j]; 
                    values[j] = values[j + 1]; 
                    values[j + 1] = backup; 
                }
            }
        }
        System.out.println("Median =" + values[medianIdx]); // 45 


        // prices 99.9, 13.8, 9.9, 1200.0 
        // quantities 3, 10, 12, 20
        // amounts (amount = price * quantity)
        double[] prices = new double[] {99.9, 13.8, 9.9, 1200.0}; 
        int[] quantities = new int[] {3, 10, 12, 20}; 
        double[] amounts = new double[prices.length];
        for (int i = 0; i < amounts.length; i++) {
            amounts[i] = prices[i] * quantities[i]; 
        } 
        System.out.println(Arrays.toString(amounts));
    

        for (int i = 0; i < prices.length; i++) {
            double amounts = prices[i] * quantities[i]; 
            System.out.println("item" + (i+1) + " amount = " + amounts);

        // 
        String [] usernames = new String[] {"johnwong", "stevenchan", "jennyng"}; 
        String [] passwords = new String[] {"abcd1234", "ijk789", "xyz456"}; 

        String usernameInput = "stevenchan"; 
        String passwordInput = "ijk789"; 

        // 1. Username is NOT found; 
        // 2. Password is wrong (Scenario: Username is found); 
        // 3. Login success. 

        int userIdx = -1; 
        for (int i = 0; i < usernames.length; i++) {
            if (usernameInput.equals(usernames[i])) {
                userIdx = i; 
                break; 
            }
        }
        if (userIdx == -1) { 
            System.out.println("User is NOT found.");
        }   else {
            if (passwordInput.equals(passwords[userIdx]))   {
                System.out.println("Login succcess.");
            }   else {
                System.out.println("Password is wrong.");
            }
        }

        // ages 16, 66, 18, 37
        // gender "M", "F", "M", "F"
        // smokers false, true, true, false
        int[] ages = new int[] {16, 66, 18, 37}; 
        char[] genders = new char[] {'M', 'F', 'M', 'F'}; 
        boolean[] smokers = new boolean[] {false, true, true, false}; 

        // baseFee = 100 
        // 1. Smoker -> +20% fee
        // 2. age > 60 -> +30% fee 
        // 3. gender femail -> 5% fee 

        // calculate fees 
        int percentage = 0; 
        double baseFee = 100.0; 
        double[] fees = new double[ages.length]; 

        for (int i = 0; i < fees.length; i++) {
            if (smokers[i]) {
                percentage += 20; 
            }
            if (ages[i] > 60) {
                percentage += 30; 
            }
            if (genders[i] == 'F')  {
                percentage += 5; 
            }
        }
        //double baseFee = 100.0
        double fee = baseFee * (1 + percentage / 100.0); 
        System.out.println("Fee =" + fee);

        // toCharArray()
        String staff = "John"; 
        char[] chs = staff.toCharArray(); 
        System.out.println(Arrays.toString(chs)); // [J, o, h, n]

        int b = 7; 
        b = 7; 
        System.out.println(b); // 7

        // lowercase better
        char[] characters = new char[] {'a', 'z', 'b', 'a', 'c', 'b', 'a'}; 
        
        // which letter has the max count 
        // Step 1: new int[26], count each letter
        int[] counts = new int[26]; 
        for (int i = 0; i < characters.length; i++) {
            counts[characters[i] - 'a']++; 
        }
        System.out.println(Arrays.toString(counts));

        // Step 2: find max. 
        int max = counts[0]; 
        int targetPos = 0; 
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i]; 
                targetPos = i; 
            }
        }
        System.out.println((char)(targetPos + 'a'));
    }
}