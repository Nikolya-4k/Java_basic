package homework_10_comparable_comparator;

import java.util.Comparator;

public class AgeOrderByDesk implements Comparator<Cat> {

    @Override
    public int compare(Cat kit, Cat kit2) {
        return kit2.getAge() - kit.getAge();
    }
}
