package homework_9_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution13 {
    /*
1. Create Map<String, String>
2. Put there 10 elements (key-Surname, value-Name)
3. Remove people who have the same names
4. Print the result, each element from new line
 */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Churachenko", "Nikolay");
        map.put("Pupok", "Denis");
        map.put("Sergo", "Papka");
        map.put("Churache", "Oleg");
        map.put("Sergey", "Marsin");
        map.put("ChurachenkoIlo", "Nikolay");
        map.put("Sheva", "Olya");
        map.put("Lobuda", "Irina");
        map.put("Onirovna", "Katya");
        map.put("Malushko", "Diana");

        System.out.println("Initial Map : " + map);

        Set<String> existing = new HashSet<>();
        map = map.entrySet()
                .stream()
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (HashMap.Entry entry : map.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
