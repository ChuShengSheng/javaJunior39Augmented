package lesson2;

public class Exercise4 {
    public static void main(String[] args) {

        //Вывести на консоль сумму чисел в диапазоне от 30 до 50.
        // Результатом выполнения задачи будет выведено на консоль только одно число

        int sum = 0;
        for (int i = 30; i <= 50; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
