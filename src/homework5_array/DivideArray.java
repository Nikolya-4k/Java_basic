package homework5_array;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
        /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        // implement me
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length array: "); //Вводим размер массива = 20

        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Insert numbers: "); // Вводим числа = 2 3 4 5 7 8 9 8 8 1 1 2 3 1 2 3 8 9 6 5

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
            input.close();

        int[] firstArray = new int[array.length / 2]; //Создаём два массива размером половины большего
        int[] secondArray = new int[firstArray.length];

        for (int j = 0; j < array.length; j++) {
            if (j < firstArray.length) {
                firstArray[j] = array[j];
            }
            else {
                 secondArray[j - firstArray.length] = array[j];
        }
      }
        // System.out.println(Arrays.toString(firstArray) + " : First Array");
        System.out.println(Arrays.toString(secondArray) + " : Second Array");
    }
}
