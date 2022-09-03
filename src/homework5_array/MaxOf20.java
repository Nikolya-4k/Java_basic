package homework5_array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOf20 {
        /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */

    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println(maxNumber);
    }

    private static int[] initializeArray() {
        // implement me
        Scanner input = new Scanner(System.in);
        int[] arrayFilled = new int[20]; //Вводим размер массива = 20
        System.out.println("Insert numbers: "); // Вводим числа = 2 3 4 5 7 33 9 8 22 1 87 2 3 1 2 3 8 9 6 5

        for (int i = 0; i < 20; i++) {
            arrayFilled[i] = input.nextInt();
        }
        input.close();
        return arrayFilled;
    }

    private static int max(int[] array) {
        // implement me
        Arrays.sort(array);
        return array[array.length - 1];
    }
}