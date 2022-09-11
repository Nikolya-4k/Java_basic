package homework_8_equals_hashcode;

import java.util.Objects;

public class Cat {
    /*
Override methods equals() and hashCode() that it took @name and @age
Create several object with the same names and ages and different and print the result of comparing
Override toString method - when we call System.out.println(cat) -> it should print: "Cat name: Tom, age: 5, weight: 3"
 */
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 2, 2);
        Cat cat2 = new Cat("Bob", 22, 2);
        Cat cat3 = new Cat("Kot", 2, 1);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat3.toString());
    }

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            return age == cat.age && name.equals(cat.name);

        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat name: " + name + ", age: " + age + ", weight: " + weight;
    }
}
