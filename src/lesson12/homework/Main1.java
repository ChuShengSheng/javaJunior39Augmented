package lesson12.homework;

import java.util.TreeSet;
public class Main1 {
    public static void main(String[] args) {

        Kettle kettle1 = new Kettle("Электрочайник Redmond RK-M158 черный", "черный", "металл", 2899, 1.7, 1800, 1.1);
        Kettle kettle2 = new Kettle("Электрочайник Bosch TWK 7607 бежевый", "бежевый", "пластик", 3399, 1.7, 2200, 0.98);
        Kettle kettle3 = new Kettle("Электрочайник DEXP DW1500 белый", "белый", "металл", 1499, 1.5, 1600, 1.0);
        Kettle kettle4 = new Kettle("Электрочайник Polaris PWK 1260 белый", "белый", "керамика", 3699, 1.2, 1200, 1.4);
        Kettle kettle5 = new Kettle("Электрочайник Kitfort KT-655 черный", "черный", "стекло/пластик", 1699, 2.0, 2200, 0.81);

        TreeSet<Kettle> kettles = new TreeSet<>();
        kettles.add(kettle1);
        kettles.add(kettle2);
        kettles.add(kettle3);
        kettles.add(kettle4);
        kettles.add(kettle5);

        for(Kettle k: kettles){
            System.out.println(k);
        }

    }

}
