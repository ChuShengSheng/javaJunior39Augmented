package lesson6.saper;

import java.util.Scanner;

public class UserInterface {
    /**
     * Создаем метод, который у пользователя берет
     * уровень игры и возвращает и возвращает его в виде числа
     * 1 - легкий
     * 2 - средний
     * 3 - сложный
     */
    public static int getGameLevelFromUser () {
        System.out.println("Выберите уровень игры");
        System.out.println("1 - легкий");
        System.out.println("2 - средний");
        System.out.println("3 - сложный");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        // рекурсия - бесчисленное повторение вызова самого себя до определенного условия

        if (level < 1 || level > 3) {
            System.out.println("Неверный ввод, введите еще раз!!!");
            return getGameLevelFromUser();
        }
        return level;
    }

}
