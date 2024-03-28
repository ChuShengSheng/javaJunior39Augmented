package lesson1;

public class Main {
    public static void main(String[] args) {

        // Есть ширина и длина стола, есть ширина и длина комнаты. Вывести на консоль,
        // сколько таких столов влезет в комнату?

        int widthTable = 124;
        int lengthTable = 80;

        int widthRoom = 1200;
        int lengthRoom = 800;

        int areaTable = widthTable * lengthTable;
        int areaRoom = widthRoom * lengthRoom;

        double countTable = (double) areaRoom / areaTable;
        System.out.println(countTable);

    }

}
