import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
    public static void main(String[] args) {
        Deque<Student> studentQueue = new LinkedList<>(); 
        studentQueue.add(new Student("Leo", 50)); 
        studentQueue.add(new Student("Sally", 10)); 
        studentQueue.add(new Student("Peter", 99)); 
        studentQueue.addLast(new Student("Steve", 55)); 
        studentQueue.addFirst(new Student("Oscar", 93)); //! addFirst is only for Deque
        
        System.out.println(studentQueue.poll().getName()); // poll First 
        System.out.println(studentQueue.pollLast().getName()); // pollLast //! only for Deque

        studentQueue.peek(); // peekFirst 
        studentQueue.peekLast();  // ! only for Deque 

        // Oscar, Leo, Sally, Peter, Steve
        // Leo, Sally, Peter, Steve
        // Leo, Sally, Peter
        Student target = null; 
        while (!studentQueue.isEmpty()) {
            if (studentQueue.peekFirst().getScore() > studentQueue.peekLast().getScore()) {
                target = studentQueue.pollFirst();
        }   else {
            target = studentQueue.pollFirst(); 
        }
        System.out.println(target.getName());
        }
        // Peter -> Leo -> Sally 

        //! Queue -> First In First Out 
        //! Deque -> First In First Out + Last In First Out 
        
    }
}
