import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Item 1");
        arr.add("Item 2");
        arr.add("Item 3");
        arr.add("Item 4");

        System.out.println("Original List:");
        System.out.println(arr);
        swapItems(arr, 1, 3);
        System.out.println("List after swapping items at index 1 and 3:");
        System.out.println(arr);
    }

    public static void swapItems(ArrayList<String> list, int id1, int id2) {
        if (id1 >= 0 && id1 < list.size() && id2 >= 0 && id2 < list.size()) {
            String temp = list.get(id1);
            list.set(id1, list.get(id2));
            list.set(id2, temp);
        } else {
            System.out.println("Invalid indices.");
        }
    }
}
