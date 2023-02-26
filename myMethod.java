// enqueue() - помещает элемент в конец очереди
import java.util.LinkedList;

public class myMethod {
    
    
    static LinkedList<Integer> enqueue (LinkedList<Integer> list) {
        LinkedList<Integer> enq = new LinkedList<>();
        for (Integer it : list) {
            enq.add(it);
        }
        enq.add(6);
        return enq;
    }
//     dequeue() - возвращает первый элемент из очереди и удаляет его

    static LinkedList<Integer> dequeue (LinkedList<Integer> list) {
        LinkedList<Integer> enq = new LinkedList<>();
        for (Integer it : list) {
            enq.add(it);
        }
        enq.removeFirst();
        return enq;
    }
    // first() - возвращает первый элемент из очереди, не удаляя.
        static LinkedList<Integer> first (LinkedList<Integer> list) {
            LinkedList<Integer> enq = new LinkedList<>();
            for (Integer it : list) {
                enq.add(it);
            }
            return enq; 
               
    }
 }
