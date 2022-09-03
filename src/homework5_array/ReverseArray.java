package homework5_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    /*
1. Create an Array, of 10 String elements
2. Input from the console 8 Strings and save them to the array
3. Print to the console (10 elements) in reverse order. Each element from new line
 */
    public static void main(String[] args) {
        //implement me
        Scanner scanner = new Scanner(System.in);
        String[] arrayStr = new String[10];

        System.out.println("Insert strings: ");
        for (int i = 0; i < 8; i++) {
            arrayStr[i] = scanner.next();
        }
        scanner.close();
//        Collections.reverse(Arrays.asList(arrayStr));
//        System.out.println("Reversed Array:" + Arrays.asList(arrayStr));

        for(int i = arrayStr.length - 1; i >= 0; i--) {
            System.out.println(arrayStr[i] + " ");
        }
    }

}

