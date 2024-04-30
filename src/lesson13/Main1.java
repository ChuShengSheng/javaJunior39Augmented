package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Бананы", 3);
        fridge.addProduct("Бананы", 2);
        fridge.addProduct("Яблоки", 3);
        fridge.addProduct("Морковь", 2);
        fridge.addProduct("Лук", 1);
        fridge.addProduct("Томаты", 2);
        fridge.getProduct("Бананы",1);

        fridge.printAllProducts();
        fridge.printProductWillEndSoon();
        fridge.printProductOfWhichIsTheMost();
        fridge.sortedProduct();
    }
}
