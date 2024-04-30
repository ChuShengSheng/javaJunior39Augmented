package lesson13;

import java.util.*;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts() {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void getProduct(String product, int weight) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет!");
            return;
        }

        if (products.get(product) < weight) {
            System.out.println("Недостаточно" + product + "в холодильнике!");
            products.remove(product);
            return;
        }

        if (products.get(product) == weight) {
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - weight);
    }

    /**
     * Добавить методы:
     * 1) Метод должен выводить на консоль те продукты, которые скоро закончатся (те, которых меньше 2-х кг)
     * 2) Вывести на консоль продукт, которого больше всего в холодильнике
     * 3) Вывести на консоль продукты, отсортированные по названию
     * 4)*** Вывести на консоль продукты, отсортированные по весу от меньшего
     */

    public void printProductWillEndSoon() {

    }

    public void printProductOfWhichIsTheMost(){
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println("Продукт, которого больше всего: " + maxEntry);
    }

    public void sortedProduct() {
        Map<String, Integer> unsortedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (!o1.toString().equals(o2.toString())) {
                    return o1.toString().compareTo(o2.toString());
                }
                return 0;
            }
        });
        unsortedMap.putAll(unsortedMap);

        unsortedMap.entrySet().forEach(System.out::println);
    }
}
