package homework_9_collections;

import java.util.HashMap;

public class Solution10 {
    /*
1. Create collection of HashMap<String, String>
2. Put 10 Strings there
3. Print the list of Values, each value from the new line
 */
    public static void main(String[] args) {
        String[] key = new String[]{"Kukuxa", "Murko", "Bani", "Ponka", "Buba", "Maks", "Balu", "Pudge", "Mipo", "Oto"};
        String[] value = new String[]{"001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};

        HashMap<String, String> finAdd = addElements(key, value);

        for (HashMap.Entry<String, String> pair : finAdd.entrySet()) System.out.println(pair.getValue());
    }

    public static HashMap<String, String> addElements(String[] num, String[] str) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) map.put(num[i], str[i]);
        return map;
    }
}
