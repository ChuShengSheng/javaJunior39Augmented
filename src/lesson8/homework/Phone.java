package lesson8.homework;

public class Phone {
    private String number;
    private String model;
    private int weight;


// конструкторы класса Phone

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // геттеры и сеттеры для переменных класса

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

//метод для вывода информации о телефоне

    public void displeyInfo() {
        System.out.println("номер телефона: " + number);
        System.out.println("модель телефона: " + model);
        System.out.println("вес телефона: " + weight + " грамм");
        System.out.println();
    }

    // метод для звонка

    public void receiveCall(String phoneNumber) {
        System.out.println("Звонит: " + phoneNumber);
    }
}
