import java.util.Random;
import java.util.Scanner;

public class DemoBingo {
    public static void main(String[] args) {
        System.out.println(new Random().nextInt(3)); // 0 - 2
        
        // 1 - 100 (random number)
        // bingo number: 73
        // One User
        // 0. Ask Question: Please input a number beween x and y;  
        // 1. compare user input (from scanner) to the random number
        // 1b. OUt of the range, ask the question again until you got the valid input
        // 2. if same, end game 
        // 3. if not the same, udpate the range for selection
            // for example: 
            // Round 1: user picks 69 (update new range to 70 - 100)
            // Round 2: user picks 90 (update new range to 70- - 89)
            // ...
            int bingo = new Random().nextInt(100) + 1; // (0 - 99) + 1 -> 1 - 100
            Scanner scanner = new Scanner(System.in); 
            int userInput = -1; 
            int min = 1; 
            int max = 100; 
            while (userInput != bingo) {    // ! input != bingo 就繼續玩
                System.out.println("Please input a number between " + min + " and " + max + ":");
                userInput = scanner.nextInt(); 
                if (userInput < min || userInput > max) {
                    continue; // skip the rest
                }
                if (userInput < bingo) {
                    min = userInput + 1; 
                }   else if (userInput > bingo) {
                    max = userInput - 1; 
                }
        }
        System.out.println("Bingo, number =" + bingo);        
    }
}