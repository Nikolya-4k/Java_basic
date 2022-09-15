package homework_9_collections;

import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    /*
1. Create the class Cat with variable name
2. Create HashMap<String, Cat>
3. Add to the map 10 cats, as a key, use the name of the Cat
4. Print to the console each element from new line
 */
    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "[* " + name + " *]";
        }
    }

    public static void main(String[] args) {
        String[] cats = new String[]{"Kukuxa", "Murko", "Bani", "Ponka", "Buba", "Maks", "Balu", "Pudge", "Mipo", "Oto"};
        HashMap<String, Cat> map = addCats(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }

    public static HashMap<String, Cat> addCats(String[] cats) {
        HashMap<String, Cat> map = new HashMap<>();

        for (String cat : cats) {
            map.put(cat, new Cat(cat));
        }
        return map;

    }
}
