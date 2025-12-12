import java.math.BigDecimal;

public class DemoStringBuilder {
    public static void main(String[] args) {
        // ! StringBuilder is 不斷修改自己
        StringBuilder sb = new StringBuilder(); // "" empty string
        sb.append("hello"); 
        System.out.println(sb); // hello
        sb.append("!!!"); 
        System.out.println(sb); // hello!!!

        // ! String is immutable
        String s = "hello"; 
        String s2 = s.concat("!!!"); 
        System.out.println(s2); // hello!!!
        System.out.println(s); // hello

        // Compare StringBuilder AND String Performance 
        long before = System.currentTimeMillis(); 
        String x = ""; 
        for (int i = 0; i < 100_000; i++) {
            x += "a"; 
        }
        long end = System.currentTimeMillis(); 
        System.out.println(x.length()); // 100_000
        System.out.println(end - before); // 282ms

        // ! StringBuilder Test 
        before = System.currentTimeMillis(); 
        StringBuilder sb2 = new StringBuilder(); 
        for (int i = 0; i < 100_000; i++) {
            sb2.append("a"); 
        }
        end = System.currentTimeMillis(); 
        System.out.println(sb2.length());
        System.out.println(end - before); // 2 ms

        // ! No Big Diffefence if you just concat the String once only 
        String webUrl = "https://"; 
        webUrl = webUrl + "www.apple.com"; 

        // Other methods
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.isEmpty());
        System.out.println(sb2.indexOf("a"));
        System.out.println(sb2.substring(0,3));
        
        // !!!!!!
        String input = "hello";
        StringBuilder sb4 = new StringBuilder(input); 
        sb4.reverse();
        System.out.println(sb4); // olleh

        // !!!!!! deleteCharAt
        StringBuilder sb3 = new StringBuilder(input); 
        sb3.deleteCharAt(3); 
        System.out.println(sb3); // helo // delete 咗第 4 粒

        double d1 = 0.2; 
        double result = BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(0.1)).doubleValue();
        System.out.println(result);
    }
}
