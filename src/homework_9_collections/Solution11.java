package homework_9_collections;

import java.util.HashMap;

public class Solution11 {
    /*
1. Create collection of HashMap<String, Object>
2. Put 10 Strings there
3. Print the map, each pair from new line
Example:
    Sim - 5
 */
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Warior", "DD");
        map.put("Mage", "RDD");
        map.put("Rogue", "MDD");
        map.put("Hunter", "rdd");
        map.put("Priest", "support");
        map.put("ded", "baba");
        map.put("pudge", "tolstiy");
        map.put("coffe", "espresso");
        map.put("note", "book");
        map.put("winter", "is_coming");

        for (HashMap.Entry entry : map.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
