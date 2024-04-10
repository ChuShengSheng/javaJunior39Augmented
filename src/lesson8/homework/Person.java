package lesson8.homework;

public class Person {
    private String fullName;
    private int age;

    // конструкторы класса Person

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    //геттеры и сеттеры для переменных класса

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
// методы move() и talk()

    public void move() {

        System.out.println(fullName + " двигается.");
    }

    public void talk() {

        System.out.println(fullName + " говорит.");
    }
}
