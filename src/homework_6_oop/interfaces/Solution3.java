package homework_6_oop.interfaces;

public class Solution3 {
    /*
    There are interfaces Fly, Move, Eat.
    Add proper interfaces to the classes: Dog, Car, Duck, Airplane
     */
    interface Fly {
        void fly();
    }
    interface Move {
        void move();
    }
    interface Eat {
        void eat();
    }

    class Dog implements Eat, Move {
        @Override
        public void eat() {
        }
        @Override
        public void move() {
        }
    }
    class Car implements Move {
        @Override
        public void move() {
        }
    }
    class Duck implements Eat, Fly, Move {
        @Override
        public void eat() {
        }
        @Override
        public void move() {
        }
        @Override
        public void fly(){
        }
    }
    class Airplane implements Fly, Move {
        @Override
        public void fly() {
        }
        @Override
        public void move() {
        }
    }
}
