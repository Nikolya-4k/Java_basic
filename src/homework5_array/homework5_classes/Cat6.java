package homework5_array.homework5_classes;

public class Cat6 {
    String name;
    int weight;
    int age;
    String color;
    String address;

    /*
    Create 5 constructors
    1. Name
    2. Name, weight, age
    3. Name, age. (weight should be standard)
    4. weight, color. (name, address and age are unknown. Cat is homeless)
    5. weight, color, address
    Each constructor should create the valid object.
    For example, if we don't know weight, we should specify some kind of standard weight.
    Because cat cannot weight anything
    The same with age
    But it cannot have name(null) and address(null)
     */
    public Cat6(String name) {
        this.name = name;
        this.weight = 1;
        this.age = 1;
        this.color = "gray";
        this.address = "street: shevchenka 78";
    }

    public Cat6(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "gray";
        this.address = "street: shevchenka 78";
    }

    public Cat6(String name, int age) {
        this.name = name;
        this.weight = 1;
        this.age = age;
        this.color = "gray";
        this.address = "street: shevchenka 78";
    }

    public Cat6(int weight, String color) {
        this.name = "undefined";
        this.weight = weight;
        this.age = 1;
        this.color = color;
        this.address = "undefined";
    }

    public Cat6(int weight, String color, String address) {
        this.name = "undefined";
        this.weight = weight;
        this.age = 1;
        this.color = color;
        this.address = address;
    }
}
