package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Integer> strings = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        strings.add(8);
        strings.add(4);
        strings.add(5);
        strings.add(6);

        System.out.println(strings);

    }

}
