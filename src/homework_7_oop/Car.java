package homework_7_oop;

public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    abstract public void setEngine();
}
