import java.util.Arrays;
import java.util.Set;

public class Lab07 {
    public static void main(String[] args) {
        Set<Integer> hashset = new Hashset<>();
        Set<Integer> otherSet = new Hashset<>();

        hashset.add(5);
        hashset.add(10);
        hashset.add(15);
        System.out.println("Size: " + hashset.size());

        System.out.println("Is it Contains 10? " + hashset.contains(10));
        System.out.println("Is it Contains 20? " + hashset.contains(20));

        Object[] array = hashset.toArray();
        System.out.println("Print memebers: " + Arrays.toString(array));

        hashset.remove(10);
        System.out.println("Size: " + hashset.size());


        otherSet.add(5);
        otherSet.add(20);
        otherSet.add(25);

        hashset.addAll(otherSet);
        System.out.println("Size: " + hashset.size());

        hashset.removeAll(otherSet);
        System.out.println("Size: " + hashset.size());

        hashset.retainAll(otherSet);
        System.out.println("Size: " + hashset.size());
        System.out.println("Is it Contains 5? " + hashset.contains(5));

        hashset.clear();
        System.out.println("Size: " + hashset.size());
    }
}
