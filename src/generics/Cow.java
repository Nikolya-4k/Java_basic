package generics;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String greetings() {
        return "muuuu";
    }
}

