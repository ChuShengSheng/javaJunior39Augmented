package lesson3;

public class Main8 {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 8, 7, 6, 5, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
