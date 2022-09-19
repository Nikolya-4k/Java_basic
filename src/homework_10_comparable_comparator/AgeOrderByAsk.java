package homework_10_comparable_comparator;

import java.util.Comparator;

public class AgeOrderByAsk implements Comparator<Cat> {

    @Override
    public int compare(Cat kit, Cat kit2) {
        return kit.getAge() - kit2.getAge();
    }
}
