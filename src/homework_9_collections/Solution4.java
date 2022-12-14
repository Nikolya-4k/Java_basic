package homework_9_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution4 {
    /*
1. Create List of Strings
2. Read from the console 5 strings and add them to the List, each element to the beginning of this List
3. Using loop, print all the items to the console from the List
 */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Strings");

        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            list.addFirst(str);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
