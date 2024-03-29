package lesson4;

public class Homework1 {
    public static void main(String[] args) {
        int[][] numbers = new int[8][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == numbers[i].length - j - 1) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
