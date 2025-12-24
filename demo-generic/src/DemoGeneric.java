import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) throws Exception {
        // Java 5 ()
        String[] names = new String[3]; // fixzed length   
        ArrayList<String> strings = new ArrayList<>(); 

        // Before Java 5
        List emails = new ArrayList(); //! Java: compile time not ensure the type.
        // List<Object> objects = new ArrayList<>(); //! similar to List<Object> 

        emails.add("leo@gmail.com"); 
        emails.add("jenny@gmail.com"); 
        System.out.println(emails.size()); // 2

        //! 咩都放到入去，所以 call 唔到 charAt 
        emails.add(100); 
        emails.add(true); 
        emails.add('c'); 
        //System.out.println(emails.get(0).charAt(0));
        
        for (Object o : emails) {
            if (o instanceof String) { // ! check the type of object
                String s = (String) o; // ! 著番件衫, Polymorphism 
                System.out.println(s.charAt(0));
            }   else if (o instanceof Boolean) {

            }   else if (o instanceof Integer) {

            }
        }

        List<String> passwords = new ArrayList<>(); 
        // passwords.add(100); 
        passwords.add("abcd1234"); 
        passwords.add("ABC1234!"); 

        for (String p : passwords) {
            System.out.println(p.charAt(0));
        }
    }
}
