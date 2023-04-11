import java.util.LinkedList;
import java.util.Queue;

public class Ex002 {

    // String[] arr = new String[]{"1", "2", "22", "3", "33"};
    Queue<String> queue = new LinkedList<>();
        
    void enqueue(String elem) {
        queue.add(elem);
    }

    void print() {
        System.out.println(queue);
    }

    void dequeue() {
        queue.poll();
    }

    void first() {
        queue.peek();
    }
}