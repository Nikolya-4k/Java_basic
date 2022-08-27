package homework4_if_else;

import java.util.Scanner;

public class MaxOfFour {
    /*
    Enter and reed four numbers from the console
    Implement method which prints max of four variable
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        printMaxOfFour(one, two, three, four);
        scanner.close();
    }

    private static void printMaxOfFour(int a, int b, int c, int d) {
        //Implement me
        if (a > b && a > c && a > d)
            System.out.println("This number is more: " + a);
        else if (b > a && b > c && b > d)
            System.out.println("This number is more: " + b);
        else if (c > a && c > b && c > d)
            System.out.println("This number is more: " + c);
        else
            System.out.println("This number is more: " + d);
    }
}
