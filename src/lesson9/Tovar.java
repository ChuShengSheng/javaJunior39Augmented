package lesson9;

import java.util.ArrayList;
import java.util.Objects;
public class Tovar {
    // 1 - поля класса, то что нам важно относительно этого объекта
    private String fullName;
    private int price;
    private int sellePrice;
    private ArrayList<Otziv> otzivs = new ArrayList<>();

    // 2 - конструкторы - особый метод, который вызывается после слова new,
    // и рождает новый объект

    public Tovar(int price, int sellePrice) {
        this.price = price;
        this.sellePrice = sellePrice;
    }

    public Tovar(String fullName, int price, int sellePrice) {
        this.fullName = fullName;
        this.price = price;
        this.sellePrice = sellePrice;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSellePrice() {
        return sellePrice;
    }

    public void setSellePrice(int sellePrice) {
        this.sellePrice = sellePrice;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (sellePrice != tovar.sellePrice) return false;
        if (!Objects.equals(fullName, tovar.fullName)) return false;
        return Objects.equals(otzivs, tovar.otzivs);
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + sellePrice;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "fullName='" + fullName + '\'' +
                ", price=" + price +
                ", sellePrice=" + sellePrice +
                ", otzivs=" + otzivs +
                '}';
    }

}
