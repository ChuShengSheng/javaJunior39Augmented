package lesson6.createMethodsHomework;

import java.util.Scanner;

public class AllMethodsInHomework {
    /**
     * Метод принимает входящими параметрами текст,
     * и возвращает кол-во гласных букв в тексте
     */

    public static int totalCountOfVowels(String text) {
        int totalCountOfVowels = 0;
        String allVowels = "aiuoe";
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            if (allVowels.contains(ch + "")) {

                totalCountOfVowels++;
            }
        }

        return totalCountOfVowels;
    }

    /**
     * Метод принимает входящими параметрами текст,
     * печатает на консоль этот же текст,
     * только в обратном порядке
     */

    public static int PrintStringInReversOrder(String string) {

        char[] reverseArray = string.toCharArray(); // Преобразуем строку string в массив символов (char)
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }
        return 0;
    }

    /**
     * Метод принимает входящими параметрами текст,
     * и печатает на консоль
     * сколько в тексте знаков пунктуации
     */

    public static void PrintPunctuationCharacterInString(String string) {

        int countPunctuationCharacter = 0;
        for (int i = 0; i < string.length(); i++) {
            String allPunctuationCharacter = ".,;:-";
            char ch = string.charAt(i);
            if (allPunctuationCharacter.contains(ch + "")) {

                // подсчитывать приращения, если в строке есть знак пунктуации
                countPunctuationCharacter++;
            }
        }
        // отобразить общее количество знаков пунктуации в строке
        System.out.println("Общее количество знаков пунктуации в строке равно: " + countPunctuationCharacter);
    }

    /**
     * В метод передаем кол-во строк и кол-во колонок,
     * метод печатает на консоль квадрат из единичек
     * по этим параметрам
     */
    public static void printSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и колонок: ");
        int rowCol = scanner.nextInt();
        char[][] square = new char[rowCol][rowCol];
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                if (row >= col || row <= col) {

                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }

    /**
     * В метод передаем 3 числа,
     * метод должен вернуть меньшее число из 3-х
     */

    public static int findTheMinimumNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        System.out.println("Введите число 2:");
        System.out.println("Введите число 3:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min = 0;

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        return min;
    }

    /**
     * В метод передаем сумму депозита,
     * банковский процент и кол-во лет,
     * и метод возвращает значение прироста процентов
     * которые мы заберем с банка через столько лет
     */

    public static double interestGrowth() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму депозита:");
        System.out.println("Введите банковский процент:");
        System.out.println("Введите количество лет:");
        double money = scanner.nextInt();
        double prosent = scanner.nextInt();
        int year = scanner.nextInt();

        for (int month = 0; month < year * 12; month++) {
            money = money + (money / 100 * prosent) / 12;
        }
        return (money);
    }

    /**
     * В метод передаем email,
     * метод должен вернуть true или false подходит нам email или нет.
     * Подходит: когда содержит @, когда нет пробелов,
     * когда часть текста после @ содержит в себе точку
     */

    public static String checkTheValidityOfTheEmail(String email) {


        if (!email.contains("@")) {
            System.out.println("Не содержит собачку!!!");
            return email;
        }

        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length > 2) {
            System.out.println("Собачек больше одной!!!");
            return email;
        }

        if (email.startsWith("@") || email.endsWith("@")) {
            System.out.println("Email не может начинаться или заканчиваться собачкой!!!");
            return email;
        }

        String lastPart = partsOfEmail[1];
        if (!lastPart.contains(".")) {
            System.out.println("Email не содержит точку после собачки!!!");
            return email;
        }

        String lastPartForDot = partsOfEmail[1];
        if (lastPartForDot.startsWith(".")) {
            System.out.println("Email содержит точку сразу после собачки!!!");
            return email;
        }

        if (email.contains("#") || email.contains("$") || email.contains("%") || email.contains("&")
                || email.contains("`") || email.contains("~") || email.contains("'") || email.contains("*")
                || email.contains("+") || email.contains("=") || email.contains("/") || email.contains("?")
                || email.contains("^") || email.contains("|") || email.contains("(") || email.contains(")")
                || email.contains("[") || email.contains("]") || email.contains("{") || email.contains("}")) {
            System.out.println("Содержит запрещеный символ!!!");
            return email;
        }

        String numberCharactersFirstPart = partsOfEmail[0];
        int countNumberFirstPart = numberCharactersFirstPart.length();
        if (countNumberFirstPart < 4 || countNumberFirstPart > 20) { //
            System.out.println("Почта содержит не корректное количество символов!!!");
            return email;
        }


        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Email не может начинаться или заканчиваться точкой!!!");
            return email;
        }

        String[] partsOfEmailDot = email.split("[.]");
        String lastPartDot = partsOfEmailDot[partsOfEmailDot.length - 1];
        if (lastPartDot.contains("0") || lastPartDot.contains("1") || lastPartDot.contains("2")
                || lastPartDot.contains("3") || lastPartDot.contains("4") || lastPartDot.contains("5")
                || lastPartDot.contains("6") || lastPartDot.contains("7") || lastPartDot.contains("8")
                || lastPartDot.contains("9")) {
            System.out.println("Содержит цифры после последней точки!!!");
            return email;
        }

        if (email.contains(" ")) {
            System.out.println("Почта содержит пробелы!!!");
            return email;
        }

        return email;
    }

}
