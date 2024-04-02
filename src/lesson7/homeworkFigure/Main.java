package lesson7.homeworkFigure;

public class Main {
    public static void main(String[] args) {

        Triangle right = new Triangle(); // треугольник прямоугольный
        right.setFirstSide("CathetA"); // первая сторона
        right.setSecondSide("CathetB"); // вторая сторона
        right.setThirdSide("HypotenuseC"); // третья сторона
        right.setAngle(90); // угол 90 градусов
        right.setHeight("HeightH"); // высота

        Triangle acuteAngled = new Triangle(); // треугольник остроугольный
        acuteAngled.setFirstSide("BaseA"); // первая сторона
        acuteAngled.setSecondSide("SideB"); // вторая сторона
        acuteAngled.setThirdSide("SideC"); // третья сторона
        acuteAngled.setAngle(70); // угол менее 90 градусов
        acuteAngled.setHeight("HeightH"); // высота

        Triangle obtuse = new Triangle(); // треугольник тупоугольный
        obtuse.setFirstSide("BaseA"); // первая сторона
        obtuse.setSecondSide("SideB"); // вторая сторона
        obtuse.setThirdSide("SideC"); // третья сторона
        obtuse.setAngle(110); // угол более 90 градусов
        obtuse.setHeight("HeightH"); // высота

        System.out.println();
    }
}
