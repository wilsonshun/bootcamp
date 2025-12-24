import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        // PriorityQueue -> Queue 
        // ArrayDeque -> Deque 
        // LinkedList -> Deque 
        // ArrayDeque 

        // ! We have only 1 object ArrayDeque
        // ! But we have 4 different object references 
        // ! 要越少 Methods 完成最多事情

        ArrayDeque<String> names = new ArrayDeque<>();
        Collection<String> namesCollection = names; // ! Hiding 合約以外所有嘢 
        Queue<String> namesQueue = names; // ! Hiding 合約以外所有嘢
        Deque<String> namesDeque = names; 
        
        

        // What are the differences? 
        namesDeque.poll(); //! determined by Deque
        namesDeque.push("John"); //! determined by Deque
        namesDeque.add("John"); 
        namesDeque.pollLast(); 
        namesDeque.pollFirst(); 

        namesQueue.poll(); 
        namesQueue.add("Sally");
        // names.Queue.push("John"); 
        // namesQueue.pollLast(); 
        // namesQueue.pollFirst(); 

        namesCollection.add("Leo"); 
        // namesCollection.poll(); 
        // namesCollection.push("John"); 
        // namesCollection.pollLast(); 
        // namesCollection.pollFirst(); 

        // Queue // ! 唔能夠同 Hash 有任何關係
        //! 90% scenarios -> LinkedList for Queue 
        //! 右邊決定底層
        Queue<Student> studentQueue = new LinkedList<>(); // ! ArrayDeque can be changed to LinkedList 
        studentQueue.add(new Student("Leo", 50)); //! add to tail (addLast)
        studentQueue.add(new Student("Sally", 10)); 
        studentQueue.add(new Student("Peter", 99)); 

        //! Look up the first element 
        System.out.println(studentQueue.peek().getName()); // Leo
        System.out.println(studentQueue.peek().getName()); // Leo

        Student queueHead = studentQueue.poll(); //! Queue 嚴禁中間 Elements 離開 //! Remove first
        System.out.println(queueHead.getName()); // Leo

        System.out.println(studentQueue.peek().getName()); // Sally

        // poll() -> Pick the head 
        // add() -> Add to tail 

        // Queue<String> 
        // "apple", "orange", "kiwi", "banana"

        Queue<String> fruitQueue = new ArrayDeque<>(); // ! can be changed to LinkedList 
        fruitQueue.add("apple"); 
        fruitQueue.add("orange"); 
        fruitQueue.add("kiwi"); 
        fruitQueue.add("banana"); 

        System.out.println(fruitQueue.contains("orange")); // true
        System.out.println(fruitQueue.remove("kiwi")); // loop
        System.out.println(fruitQueue.size()); // 4
        System.out.println(fruitQueue); // [apple, orange, banana]

        // ! Queue Loop -> Consume -> First in first out 
        while(fruitQueue.isEmpty()) {
            String fruit = fruitQueue.poll(); 
            // do something for the fruit 
            System.out.println(fruit);
        }

    }
}
