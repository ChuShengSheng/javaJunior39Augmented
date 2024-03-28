package lesson2;

public class Exercise3 {
    public static void main(String[] args) {

        // напечатать на консоль числа от 100 до 200 которые делятся на три и на пять одновременно без остатка

        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
