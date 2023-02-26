// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.*;

public class main1 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        myMethod.enqueue(list);
        System.out.println(myMethod.enqueue(list));
        System.out.println();
        System.out.println(myMethod.dequeue(list));
        System.out.println();
        System.out.println(myMethod.first(list));
    }
}