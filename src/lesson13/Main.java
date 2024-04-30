package lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> fridge = new HashMap<>();   // fridge -холодильник
        fridge.put("Вода",10);
        fridge.put("Слива",10);
        fridge.put("Сахар",10);

        System.out.println(fridge);
    }
}
