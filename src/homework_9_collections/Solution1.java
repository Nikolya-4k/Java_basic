package homework_9_collections;

import java.util.ArrayList;

public class Solution1 {
    /*
1. Create List of Strings
2. Add 5 different strings
3. Print to the console the size of the List
4. Using loop, print all the items to the console from the List
 */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Lineage_2");
        list.add("WoW");
        list.add("BDO");
        list.add("Witcher_3");
        list.add("Diablo_2");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
