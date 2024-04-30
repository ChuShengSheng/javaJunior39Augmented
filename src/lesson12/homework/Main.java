package lesson12.homework;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(4);

        Collection<Integer> b = new LinkedList<>();
        b.add(6);
        b.add(5);
        b.add(6);
        b.add(2);
        b.add(4);

        Collection<Integer> result = new LinkedList<>();

        result.addAll(a);
        result.addAll(b);

        System.out.println(result);

    }
}
