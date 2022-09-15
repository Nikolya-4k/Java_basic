package homework_9_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
    /*
1. Create List of Strings
2. Read from the console 5 strings and add them to the List (Scanner class)
3. Using loop find the shortest string in the List
4. Print to the console found string
5. If there are several shortest strings, print each of them.
 */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five strings");

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            list.add(s);
        }

        int h = list.get(0).length();
        for (String s : list) {
            if (s.length() < h)
                h = s.length();
        }

        for (String s : list) {
            if (s.length() == h)
                System.out.println(s);
        }
    }
}
