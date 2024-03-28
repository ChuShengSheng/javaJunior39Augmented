package lesson2;

public class Main1 {
    public static void main(String[] args) {

        // Есть число (задаем сами).
        // Нужно на консоль вывести true - если число четное,
        // и false - если нечетное (слайд задача 4)

        int number = 13;

        // 13 % 2 = 1  16 % 2 = 0  1023 % 2 = 1

        int ostatokOtDeleniya = number % 2;

        // 8-й примитивный тип - boolean (true или false)

        boolean isChetnoe = ostatokOtDeleniya == 0;
        System.out.println(isChetnoe);
    }
}
