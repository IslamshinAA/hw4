// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
// Постараться не обращаться к листу по индексам.
import java.util.*;

public class main {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        System.out.println(" LinekList:");
        System.out.println(list);
        System.out.println("\"Перевернутый\" LinekList:");
        System.out.println(revertLinkedList(list));
        revertLinkedList(list);
    }
    static LinkedList<String> revertLinkedList(LinkedList<String> list){
        LinkedList<String> result = new LinkedList<>();
        for (String num : list) {
            result.addFirst(num);
        }
        return result;
    }
}