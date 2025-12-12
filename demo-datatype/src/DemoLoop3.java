import java.util.Arrays;

public class DemoLoop3 {
    public static void main(String[] args) {
        // while loop 
        String s = "hello"; 
        int n = 0; 
        while (n < s.length()) {
            System.out.println(s.charAt(n));
            n++; 
        }   

        // for (int i = 0; i < 2; i++)
        // ! same iteration: access more than 1 element (s.charAt[i] .. s.charAt(I + 1))
        // ! Read and Write
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // for-each (loop through all elements once)
        // ! Same iteration: access 1 element ONLY 
        // ! Read ONLY 
        char[] chs = s.toCharArray(); 
        for (char ch : chs ) { // ! RHS 必係眾數
            System.out.println(ch);
            ch = 'x'; // ! Meaningless 
        }   System.out.println(Arrays.toString(chs)); // [h, e, l, l, o]

        // int[] 4, -8, 100, 34
        // for-each print all elements
        int[] arr = new int[] {4, -8, 100, 34}; 
        for (int bootcamp : arr) {
            System.out.println(bootcamp);
        }

        double[] prices = new double[] {4.5, 90.9, 23.3, 10.2}; 
        for (double price : prices)    {
            System.out.println(price);
        }

        // do-while (the loop to be executed once)
        // DemoBingo -> do while 
        n = 0; 
        do {
            System.out.println("hello"); // n = 0 - 4
            n++; 
        } while (n < 5); 

        // String method split()
        String email = "Dear Sir, I am writing to ..."; 
        String[] words = email.split(" "); // return String[]
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
