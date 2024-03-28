package lesson3;

public class Main6 {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 8, 7, 6, 5, 3};
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}
