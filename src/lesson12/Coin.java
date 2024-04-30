package lesson12;

import java.util.Objects;
public class Coin implements Comparable<Coin> {
    private int nominal;
    private double diametr;
    private String metall;
    private int year;

    public Coin() {
    }

    public Coin(int nominal, double diametr, String metall, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.metall = metall;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal = " + nominal +
                ", diametr = " + diametr +
                ", metall = '"  + metall + '\'' +
                ", year = " + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (Double.compare(diametr, coin.diametr) != 0) return false;
        if (year != coin.year) return false;
        return Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        if(this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }

        if(this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();
        }

        if(this.getDiametr() != o.getDiametr()){
            return Double.compare(this.getDiametr(), o.getDiametr());

        }
        return this.getMetall().compareTo(o.getMetall());
    }

}
