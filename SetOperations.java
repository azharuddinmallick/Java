// Suppose you are given two sets of integers, A and B, represented as HashSet objects in Java. You are required to implement a Java program that performs the following operations:

// Calculate the intersection of sets A and B.
// Determine if set A is a subset of set B.
// Calculate the union of sets A and B.
// Your program should include the following methods:

// calculateIntersection(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns a new HashSet containing the intersection of setA and setB.
// isSubset(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns true if setA is a subset of setB, otherwise returns false.
// calculateUnion(HashSet<Integer> setA, HashSet<Integer> setB): This method takes two HashSet objects setA and setB as input and returns a new HashSet containing the union of setA and setB.


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
