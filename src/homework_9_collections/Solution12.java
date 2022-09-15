package homework_9_collections;

import java.util.HashSet;
import java.util.Set;

public class Solution12 {
    /*
1. Create Set<Integer>
2. Add there 20 different numbers
3. Remove from the set all the numbers bigger than 10
 */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int max = 30;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 20; i++) {
            int rand = (int) (Math.random() * range) + min;
            set.add(rand);
        }

        set.removeIf(entry -> entry > 10);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
