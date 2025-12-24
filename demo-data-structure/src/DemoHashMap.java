import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        // ArrayList, HashSet, LinkedList 

        // KEY -> Value
        // Student id -> Student 
        ArrayList<Student> students = new ArrayList<>(); 
        students.add(new Student("John", 30)); 
        students.add(new Student("Sally", 80)); 
        students.add(new Student("Leo", 90)); 

        // KEY: Student name, VALUE: Student
        Map<String, Student> studentMap = new HashMap<>(); 
        for (Student student : students) {
            studentMap.put(student.getName(), student); // add Entry
        }

        // for searching, you just use get () to find the target object
        // ! HashMap.get() -> use Key to find Value 
        System.out.println(studentMap.get("Sally").getScore()); // 80

        // A Map has many entries
        for (Map.Entry <String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue()); // You can override toString()
        }
        
        //! Hashmap use get() to find target object, while ArrayList must use for loop 
        Student leo = studentMap.get("Leo"); //! this is risky if not having below
        if (leo != null) { // eliminate the risks 
            System.out.println("Leo exists ..." + leo.getName() + "/" + leo.getScore());
        }   else {
            System.out.println("Leo doesn't exist.");
        }



    }
}
