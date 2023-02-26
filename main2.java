// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
import java.util.*;

public class main2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Met(list);
    }

    static void Met (LinkedList<Integer> list){
        System.out.println("Список:");
        System.out.println(list);
        int sum=0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            sum += integer;
        }
        System.out.println("Сумма элементов:");
        System.out.println(sum);
    }
}
