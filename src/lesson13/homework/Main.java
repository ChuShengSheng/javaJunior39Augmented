package lesson13.homework;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        try {
            String string1 = "33";
            String string2 = "3";
            WorkingWithStrings stringUtils = new WorkingWithStrings();
            double result = stringUtils.div(string1, string2);
            System.out.println("1. Результат деления:");
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }


        try {
            String word = "друг";
            String text = "друг для всех — друг никому";
            WorkingWithStrings stringUtils = new WorkingWithStrings();
            int[] indices = stringUtils.findWord(text, word);
            System.out.println("\n2. Индексы вхождения слова " + word + ":");
            System.out.println(Arrays.toString(indices));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            String text = "text исхwe3одный т-235екст -2/3  kjk9-9.0";
            WorkingWithStrings stringUtils = new WorkingWithStrings();
            double[] result = stringUtils.findNumbers(text);
            System.out.println("\n3. Double числа из строки в виде массива: ");
            System.out.println(Arrays.toString(result)
            );

        } catch (CustomException e) {
            System.out.println("\nCustomException: " +e.getMessage());
        }
    }

}
