package homework_6_oop;

public class test {
    public static void main(String[] args) {
        Car blackCar = new Car();
        blackCar.km = 300;

        Car whiteCar = new Car();
        whiteCar.km = 100;

        Car blueCar = new Car();
        blueCar.km = 50;

        System.out.println(blackCar.km);
    }
}

