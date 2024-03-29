import java.util.HashSet;

public class SetOperations {
    
    public static HashSet<Integer> calculateIntersection(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        return intersection;
    }
    
    public static boolean isSubset(HashSet<Integer> setA, HashSet<Integer> setB) {
        return setB.containsAll(setA);
    }
    
    public static HashSet<Integer> calculateUnion(HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        return union;
    }
    
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        
        HashSet<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);
        
        HashSet<Integer> intersection = calculateIntersection(setA, setB);
        boolean isSubset = isSubset(setA, setB);
        HashSet<Integer> union = calculateUnion(setA, setB);
        
        System.out.println("Intersection: " + intersection);
        System.out.println("Is setA a subset of setB? " + isSubset);
        System.out.println("Union: " + union);
    }
}
