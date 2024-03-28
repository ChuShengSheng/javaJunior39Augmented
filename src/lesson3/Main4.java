package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select figure:");
        System.out.println("1 - circle"); // круг
        System.out.println("2 - square"); // квадрат
        System.out.println("3 - triangle"); // треугольник
        System.out.println("4 - ellipse"); // эллипс
        System.out.println("5 - rectangle"); // прямоугольник

        int inputFigure = scanner.nextInt();

        // выбран круг

        if (inputFigure == 1) {

            System.out.println("Input radius r:");
            int r = scanner.nextInt();

            System.out.println("Area:" + ((r * r) * Math.PI)); // площадь
            System.out.println("CircumferenceLength:" + (2 * r * Math.PI)); // длина окружности
        }

        // выбран квадрат

        if (inputFigure == 2) {

            System.out.println("Input side a:");
            int a = scanner.nextInt();

            System.out.println("Area:" + (a * a)); // площадь
            System.out.println("Perimeter:" + (a + a + a + a)); // периметр
        }

        //выбран треугольник

        if (inputFigure == 3) {

            System.out.println("Input side a:");
            int a = scanner.nextInt();

            System.out.println("Input side b:");
            int b = scanner.nextInt();

            System.out.println("Input side с:");
            int c = scanner.nextInt();

            System.out.println("Input height h:");
            int h = scanner.nextInt();

            System.out.println("Area:" + 0.5 * a * h); // площадь
            System.out.println("Perimeter:" + (a + b + c)); // периметр
        }

        //выбран эллипс

        if (inputFigure == 4) {

            System.out.println("Input largeSemi-axis a:");
            double a = scanner.nextDouble();

            System.out.println("Input smallSemi-axis b:");
            int b = scanner.nextInt();

            System.out.println("Area:" + (a * b * Math.PI)); // площадь
            System.out.println("Perimeter:" + (Math.PI * a * b + (a - b) * (a - b)) / (a + b)); // периметр
        }

        // выбран прямоугольник

        if (inputFigure == 5) {

            System.out.println("Input side a:");
            int a = scanner.nextInt();

            System.out.println("Input side b:");
            int b = scanner.nextInt();

            System.out.println("Area:" + (a * b)); // площадь
            System.out.println("Perimeter:" + (a + a + b + b)); // периметр
        }
    }
}
