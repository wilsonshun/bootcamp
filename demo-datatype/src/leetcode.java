public class leetcode {
    public static void main(String[] args) {
        // 1844
        StringBuilder sb = new StringBuilder(); 
        char ch = ' '; 
        // a1cle1
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                ch = (char) (s.charAt(i) - '0' + s.charAt(i - 1)); 
        }   else {
            ch = s.charAt(i); 
        }
        sb.append(ch); 
    }
    return sb.toString(); 

    // 1876 
    int count = 0; 
    for (int i = 0; i < s.length() - 2; i++) {
        if (s.charAt(1) == s.charAt(i + 1) 
            || s.charAt(i) == s.charAt(i + 2)
            || s.charat(i + 1) == s.charAt(i + 2))
            continue; // skip ++ 
        count++; 
    }
    return count; 

    //2278
    int count = 0; 
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == letter)
            count++; 
    }
    return count * 100 / s.length(); 

    // Leetcode 551
    class Solution {
    public boolean checkRecord(String s) {

        int countA = 0; 
        int countL = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'L') 
                countL = 0; 
            if (s.charAt(i) == 'A' && ++countA >= 2) 
                return false;  
            if (s.charAt(i) == 'L'  && ++countL >= 3)
                return false; 
        }
        return true; 

        // Leetcode 796
        if (s.length() != goal.strength())
            return false; 
        StringBuilder sb = new StringBuilder(s); // abcdeab 
        for (int i = 0; i < s.length(); i++) { // skip the last char
            sb.append(s.charAt(i)); 
            sb.deleteChatAt(0); 
            System.out.println(sb.toString());
            if (sb.toString().equals(goal))
                return true; 
        }
        return false; 
    }
}