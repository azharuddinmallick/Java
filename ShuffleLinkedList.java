import java.util.LinkedList;
import java.util.Collections;

public class ShuffleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // Shuffle the elements in the linked list
        Collections.shuffle(list);
        // Print the shuffled linked list
        for (int i : list) {
            System.out.println(i);
        }
    }
}
