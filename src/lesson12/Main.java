package lesson12;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 2.3, "Золото", 1900);
        Coin coin2 = new Coin(10, 2.3, "Золото", 1900);
        Coin coin3 = new Coin(5, 2.5, "Серебро", 1950);
        Coin coin4 = new Coin(3, 5.3, "Бронза", 1920);
        Coin coin5 = new Coin(3, 1.3, "Золото", 1920);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin3);
        coins.add(coin2);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c: coins){
            System.out.println(c);
        }
    }

}
