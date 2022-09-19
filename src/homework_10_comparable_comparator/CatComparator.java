package homework_10_comparable_comparator;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat kit, Cat kit2) {
        return kit.getName().compareTo(kit2.getName()) * -1;
    }
}
