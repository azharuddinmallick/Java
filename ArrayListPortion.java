import java.util.ArrayList;
import java.util.List;

public class ArrayListPortion {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        List<Integer> subList = arrayList.subList(1, 4);
        System.out.println("Extracted Portion: " + subList);
    }
}
