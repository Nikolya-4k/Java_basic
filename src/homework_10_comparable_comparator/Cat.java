package homework_10_comparable_comparator;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Kitten = " + name + "," + age + " age";
    }

    @Override
    public int compareTo(Cat cat) {
        return name.compareTo(cat.name);
    }


}
