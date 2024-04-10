package lesson10;

import java.util.ArrayList;
public class Library {
    private ArrayList<PrintEdition> editions = new ArrayList<>();
    public void fillEditions(){

        Book book1 = new Book("Лисьи чары", 2020, "Т8 Издательские Технологии", "Пу Сунлин",271);
        Book book2 = new Book("Долгая ночь", 2022, "Издательство Эксмо", "Цзы Цзиньчень",288);
        Book book3 = new Book("Детям про все на свете", 2018, "Издательство АСТ", "С. Я. Маршак",190);

        Jurnal jurnal1 = new Jurnal("Бурда", 2019, "Бурда",1);
        Jurnal jurnal2 = new Jurnal("Стильные прически", 2017, "EDIPRESSE-KONLIGA",4);

        editions.add(book1);
        editions.add(book2);
        editions.add(book3);
        editions.add(jurnal1);
        editions.add(jurnal2);
    }

    public void printAllEditions(){
        for (PrintEdition edition: editions) { // if each
            System.out.println(edition); // !!!! проявление полиморфизма
        }
    }

    public void printLargestBook(){
        PrintEdition largest = new Book("Заглушка",111, "Заглушка", "Заглушка",-1); // заглушка
        for(PrintEdition edition: editions){
            if(edition instanceof Book){
                if(((Book)edition).getPages() > ((Book)largest).getPages()){
                    largest = edition;
                }
            }
        }
        System.out.println("  ----  САМАЯ ТОЛСТАЯ КНИГА  ----  ");
        System.out.println(largest);
    }

}
