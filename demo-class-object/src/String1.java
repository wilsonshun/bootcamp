public class String1 {
    private char[] chs; 

    public String1(String str) {
        if (str == null) 
            this.chs = new char[0]; 
           else 
            this.chs = str.toCharArray(); 
    } 

    public String1(char[] chs){
        this.chs = chs; 
    } 

    // ! System.out.println() -> toString()
    public String toString() {
        return new String(this.chs); 
    }

    // String1 s2 = s.replace('x', 'y'); 
    public String1 replace(char from, char to) {
        char[] newChs = new char[this.chs.length]; 
        for (int i = 0; i < this.chs.length; i++) {
            if (this.chs[i] != from) 
                newChs[i] = this.chs[i]; 
            else 
                newChs[i] = to; 
        }
        return new String1(newChs); 
    }

    public boolean isEmpty() {
        return this.chs.length == 0; 
    }

    public int Length() {
        return this.chs.length; 
    }

    public char charAt(int index) {
        return this.chs[index]; 
    }

    public boolean contains(char ch) {
        for (char c : this.chs) {
            if (c == ch); 
                return true; 
        }
            return false; 
    }

    public static void main(String[] args) {
        String1 s = new String1("hello"); 

        char c = s.charAt(0); // h
        System.out.println(c);

        boolean result = s.contains('e'); // true
        System.out.println(result); 

        String1 s2 = new String1(""); 
        System.out.println(s2.length()); // 0 
        System.out.println(s2.isEmpty()); // true
        System.out.println(s2.charAt(0)); // java.lang.ArrayIndexOutOfBoundsException 
        // System.out.println();
        
        // String1 s3 = new String1(null); 
        // System.out.println(s3.isEmpty()); // true 

        String s4 = new String1("Goodbye"); 
        String s5 = s4.replace('o', 'x'); 
        System.out.println(s5); // gxxdbye 
        System.out.println(s4); // goodbye


    }
}
