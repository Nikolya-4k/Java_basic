package homework4_if_else;

import java.util.Scanner;

public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        //Implement me
        if (a > b && b > c && a > c)
            System.out.print(a + "-" + b + "-" + c);
        else if (a > b && c > b && a > c)
            System.out.print(a + "-" + c + "-" + b);
        else if (b > a && a > c && b > c)
            System.out.print(b + "-" + a + "-" + c);
        else if (b > a && c > a && b > c)
            System.out.print(b + "-" + c + "-" + a);
        else if (c > a && a > b && c > b)
            System.out.print(c + "-" + a + "-" + b);
        else
            System.out.print(c + "-" + b + "-" + a);

    }
}

