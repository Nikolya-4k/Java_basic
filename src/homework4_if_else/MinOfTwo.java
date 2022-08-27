package homework4_if_else;

import java.util.Scanner;

public class MinOfTwo {
    /*
    Enter and reed two numbers from the console
    Implement method which prints the lowest variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        printMinOfTwo(one, two);
        scanner.close();
    }

    private static void printMinOfTwo(int a, int b) {
        //Implement me
        if (a < b)
            System.out.println("This number is less: " + a);
        else
            System.out.println("This number is less: " + b);

    }
}