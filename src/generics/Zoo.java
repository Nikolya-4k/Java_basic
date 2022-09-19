package generics;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {

    private List<T> animals = new ArrayList<>();

    public void printAllAnimals() {
        for (T t : animals) {
            System.out.println(t.getName() + ": - " + t.greetings());
        }
    }

    public boolean addNewAnimals(T t) {
        boolean isAnimalsExists = false;
        for (T el : animals) {
            if (el.getName().equals(t.getName())) {
                isAnimalsExists = true;
                break;
            }
        }

        if (isAnimalsExists) {
            System.out.println(t.getName() + " is already in Zoo");
            return false;
        } else {
            animals.add(t);
            System.out.println(t.getName() + " added to Zoo");
            return true;
        }
    }
}


