package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Select game level:");
        System.out.println("1 - light");
        System.out.println("2 - medium");
        System.out.println("3 - hight");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        if (level == 1) { // выбирает легкий уровень
            int[][] field = new int[9][9];
            for (int i = 0; i < 9; i++) { // добавление 9 мин

                // добавление одной мины
                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);
                field[row][col] = 1;
            }
            for (int i = 0; i < field.length; i++) { // перебирает индексы строк
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + "  ");
                }
                System.out.println();
            }
        }
        if (level == 2) { // выбирает средний уровень
            int[][] field = new int[16][16];
            for (int i = 0; i < 16; i++) { // добавление 16 мин

                // добавление одной мины
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);
                field[row][col] = 1;
            }
            for (int i = 0; i < field.length; i++) { // перебирает индексы строк
                for (int j = 0; j < field[i].length; j++) { // перебирает индексы столбцов
                    System.out.print(field[i][j] + "  ");
                }
                System.out.println();
            }
        }
        if (level == 3) { // выбирает сложный уровень
            int[][] field = new int[30][30];
            for (int i = 0; i < 30; i++) { // добавление 30 мин

                // добавление одной мины
                int row = ThreadLocalRandom.current().nextInt(0, 30);
                int col = ThreadLocalRandom.current().nextInt(0, 30);
                field[row][col] = 1;
            }
            for (int i = 0; i < field.length; i++) { // перебирает индексы строк
                for (int j = 0; j < field[i].length; j++) { // перебирает индексы столбцов
                    System.out.print(field[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }
}
