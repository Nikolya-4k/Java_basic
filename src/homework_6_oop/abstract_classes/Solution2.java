package homework_6_oop.abstract_classes;

public class Solution2 {
    /*
    Extend classes Cat and Dog from Pet
    Implement all the necessary methods
    Classes Cat and Dog should not be abstract
     */

    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public abstract static class Cat extends Pet {
        private String name;
        private Cat child;

        @Override
        public String getName() {
            return name;
        }
        @Override
        public Pet getChild() {
            return child;
        }
    }

    public static class Dog extends Pet {
        private String name;
        private Dog child;

        @Override
        public String getName() {
            return name;
        }
        @Override
        public Pet getChild() {
            return child;
        }
    }
}
