package lesson8.homework;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Кузнецова Мария Петровна",37);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
