package lesson6.saper;

import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    /**
     * Создаем метод, который создает
     * двухмерный массив (поле сапера)
     * и возвращает его нам
     */
    public static int[][] getFieldByGameLevel (int level) {
        if (level == 1) {
            return new int [9][9];
        }
        if (level == 2) {
            return new int[16][16];
        }
        return new int [18][32];
    }

    /** Метод, который будет наполнять
     * поле минами
     */
    public static void fillMinesInField (int level, int[][] field) {
        int mines = countMinesByLevel (level);
        for (int i = 0; i < mines; i++) {
            addRandomMine (field);
        }
    }

    /**
     * Метод, который добавляет рандомно 1 мину в поле
     */
    public static void addRandomMine (int[][] field) {
        int row = ThreadLocalRandom.current().nextInt(0, field.length);
        int col = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if(field[row][col] == 1) { // а, если там уже есть мина?
            addRandomMine(field);
        }
        field[row][col] = 1;
    }

    /** Метод, который печатает на консоль
     * наше поле
     */

    public static void printField (int[][] field) {
        for(int i = 0; i < field.length; i++){ // перебирает индексы строк
            for(int j = 0; j < field[i].length; j++){ // перебирает индексы колонок
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Метод, который возвращает количество мин
     * в зависимости от уровня
     */

    private static int countMinesByLevel (int level) {
        if (level == 1) {
            return 10;
        }
        if (level == 2) {
            return 25;
        }
        return 40;
    }

}
