package homework_7_oop;

public class SportCar extends Car{
    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.println("SportCar engine: ");
        //implement here
        engine.setEngine();
    }
}