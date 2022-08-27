package homework4_for_loop;

import java.util.Scanner;

public class PrintRectangle {
        /*
    Read 2 numbers from console (m & n)
    using for loop
    print to console a rectangle size m * n from 8 numbers
    Example:
    m=2, n=4
    8888
    8888
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        rectangle(m, n);
        scanner.close();

        // implement here
    }
    private static void rectangle(int m, int n){
        if (m == n) {
            System.out.println("The sides are equal! It's already a square!");
        }
        else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(8);
                }
                    System.out.println();
            }
        }
    }
}
