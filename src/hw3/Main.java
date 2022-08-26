package hw3;

//Home work 3

public class Main {

    public static void main(String[] args) {

        String s = "Hey, How are you?";
        printMessage(s);

        printSum(7, 6);
    }

    public static void printMessage(String s) {
        System.out.println(s);
    }

    public static void printSum(int a, int b) {
        System.out.println(Integer.sum(a, b));
    }

}


