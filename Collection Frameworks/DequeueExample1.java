import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample1 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        // Adding elements
        deque.addLast("Element 1 (Tail)");
        deque.addFirst("Element 2 (Head)");
        System.out.println(deque);
        // Dequeue operations
        String head = deque.pollFirst(); // Removes "Element 2"
        String tail = deque.pollLast();  // Removes "Element 1"
        System.out.println(deque);
   }


}
