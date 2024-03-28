package lesson2;

public class Main3 {
    public static void main(String[] args) {

        // Есть 3 стороны треугольника.
        // Нужно напечатать на консоль слово:
        // Равнобедренный, Равносторонний или Разносторонний,
        // в зависимости от того, какой это треугольник (задача 5 слайды).

        int a = 12;
        int b = 15;
        int c = 14;

        if (a == b && b == c && c == a) {
            System.out.println("Равносторонний");
        } else if (a!= b && b != c && c!= a) {
            System.out.println("Разносторонний");
        } else {
            System.out.println("Равнобедренный");
        }
    }
}
