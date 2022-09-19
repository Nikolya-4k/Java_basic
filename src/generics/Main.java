package generics;

public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();

        Cat murka = new Cat("Murka");
        Cow cow = new Cow("Momo");
        Goat goat = new Goat("Belka");

        zoo.addNewAnimals(murka);
        zoo.addNewAnimals(cow);
        zoo.addNewAnimals(goat);

        zoo.printAllAnimals();
    }
}
