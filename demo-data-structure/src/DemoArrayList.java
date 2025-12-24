import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        //! Array Disadvantages; 
        // 1. Fixed Lengths
        int[] arr = new int[3]; 

        // ! Data Structure -> array and linkedlist (memory)
        // ! High level Structure -> ArrayList
        //! ArrayL -> ENTER to show "import" at the top
        //! 右手邊唔寫就已經默認係 String
        ArrayList<String> names = new ArrayList<>(); // Constructor "ArrayList<>()"
        names.add("John"); // Theory: loop 
        names.add("Steve"); // Theory: loop 
        names.add("Mary"); // Theory: loop 
        names.add("Leo"); // Theory: loop
        System.out.println(names); // arraylist.toString()

        ArrayList<Integer> scores = new ArrayList<>(); 
        scores.add(83); 
        scores.add(25); 
        scores.add(100); 
        System.out.println(scores); 
        
        //! remove -> for loop
        // 2. remove() (equals, remove the first element)
        names.remove(new String("Mary")); // remove() -> String.equals()
        System.out.println(names);

        names.remove(1); // array index

        // Class (罩住兩個 Attributes: name + score) 
        // John 83
        // Steve 25
        // Mary 100 

        Student s1 = new Student("John", 80); 
        ArrayList<Student>students = new ArrayList<>(); 
        students.add(s1); 
        students.add(new Student("Steve", 25)); 
        students.add(new Student("Mary", 100)); 

        //
        s1.setScore(90); 
        System.out.println(students.get(0).getScore()); // 90
    }
}
