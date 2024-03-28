package lesson2;

public class Exercise1 {
    // напечатать на консоль числа в диапазоне от 100 до 200 кратные трём

    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
