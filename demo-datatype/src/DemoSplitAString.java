public class DemoSplitAString {
 public static void main(String[] args) {
    // Leetcode 1221
    int balancedCheck = 0; 
    int count = 0; 
    for (int = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'R') {
            balancedCheck += 1; 
        } else {
            balancedCheck -= 1; 
        }
        if (balancedCheck == 0)
            count++;
    }
    return count; 

    // Leetcode 1370 
    int[] arr = new int[26]; // 0 - 25; 
    // s.charAt(i) - 'a' -> a - 25
    for (int i = 0; i < s.length; i++) {
        arr[s.chatAt(i) - 'a']++; 
    }
    StringBuilder result = new StringBuilder(); 
    while (result.length() < s.length()) { 
        // Step 1 + Step 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result.append ((char) (i + 'a')); 
                arr[i]--; // remove 
            }

        }
        // Step 4 + Step 5
        for (int i arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                result.append ((char)(arr[i] + 'a')) ; 
                arr[i]--; // remove 
            }
        }
    }
    return result.toString(); 

    // Leetcode 344
    // swap 
    char backup = ''; 
    for (int i = 0; i < s.length / 2; i++) {
        backup = s.[i]; 
        s[i] = s[s.length - i - 1];
        s[s.length - i - 1] = backup;  
    }

    //Leetcode 551
    String a = "Absent"; 
    String l = "Late"; 
    String p = "Present"; 
    int d = 0; 
    if (int i = 0; i < d.length)
 }   
}
