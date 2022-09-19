package homework_10_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    /*
1. Create class Cat with fields name and age
3. Implement method toString()
2. Implement Comparable interface for the Cat class, which compare cats by names
3. Create Collections with several cats, and check with the method sort() that it sorts by name
4. Create ...Comparator... class which implements interface Comparator and can sort cats by name descending
5. Create ...Comparator... class which implements interface Comparator and can sort cats by age ascending
6. Create ...Comparator... class which implements interface Comparator and can sort cats by age descending
7. Demonstrate how they work on main method
P.S. All the Classes should be in the different files
 */
    public static void main(String[] args) {
        List<Cat> kittens = new ArrayList<>();
        Cat pudge = new Cat("Pudge", 4);
        Cat sven = new Cat("Sven", 3);
        Cat bob = new Cat("Bob", 2);

        kittens.add(pudge);
        kittens.add(sven);
        kittens.add(bob);

        Collections.sort(kittens);
        System.out.println("Sort name ASK");
        for (Cat kit : kittens) {
            System.out.println(kit);
        }

        Collections.sort(kittens, new CatComparator());
        System.out.println("Sort name DESK");
        for (Cat kit : kittens) {
            System.out.println(kit);
        }

        Collections.sort(kittens, new AgeOrderByAsk());
        System.out.println("Order by age ASK");
        for (Cat kit : kittens) {
            System.out.println(kit);
        }

        Collections.sort(kittens, new AgeOrderByDesk());
        System.out.println("Order by age DESK");
        for (Cat kit : kittens) {
            System.out.println(kit);
        }
    }
}
