import java.util.*;

public class Java_Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (deque.size() > m) {
                int removed = deque.removeFirst();
                if (map.get(removed) > 1) {
                    map.put(removed, map.get(removed) - 1);
                } else {
                    map.remove(removed);
                }
            }

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, map.size());
            }
        }

        System.out.println(maxUnique);
        in.close();
    }
}
