package set;

import java.util.HashSet;
import java.util.Set;

public class SearchElement {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        boolean isContain = search1(set1, 3);
        System.out.println(isContain);
    }

    public static boolean search1(Set<Integer> set, int target) {
        return set.contains(target);
    }
}
