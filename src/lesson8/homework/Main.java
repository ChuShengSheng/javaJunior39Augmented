package lesson8.homework;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+79543768635", "Xiaomi Redmi A2", 192);
        Phone phone2 = new Phone("+79775673457", "Samsung Galaxy A14", 201);
        Phone phone3 = new Phone("+79628775806", "HUAWEI nova 11", 168);

        phone1.displeyInfo(); // выводит информацию с первого телефона
        phone2.displeyInfo(); // выводит информацию с второго телефона
        phone3.displeyInfo(); // выводит информацию с третьего телефона

        phone1.receiveCall("Мария");
        phone2.receiveCall("Дарья");
        phone3.receiveCall("Евгений");
    }
}
