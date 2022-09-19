package homework_10_generic;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
1. Create generic class Storage with 2 methods
2. With in this class, create collection
3. Create method put which saves object of any type to this collection
4. Create method get which returns the latest added object from the collection and removes it from there
 */
    public static void main(String[] args) {
        Storage<Integer> age = new Storage<>();
        age.set(1);
        age.set(2);
        age.set(6);

        Integer last = age.get();
        System.out.println(last);
    }

    static class Storage<T> {

        private List<T> list = new ArrayList<>();

        public void set(T t) {
            list.add(t);
        }

        public T get() {
            T elemLast = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return elemLast;
        }
    }
}
