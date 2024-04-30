package lesson12.homework;

import java.util.Objects;
public class Kettle implements Comparable<Kettle> {
    private String model;     // модель чайника
    private String color;     // цвет чайника
    private String bodyMaterial;  //материал корпуса
    private int price;         //цена (в рублях)
    private double volume;     //объем (в литрах)
    private int power;         //мощность (в Ваттах)
    private double weight;     //вес (в кг)

    public Kettle() {
    }

    public Kettle(String model, String color, String bodyMaterial, int price, double volume, int power, double weight) {
        this.model = model;
        this.color = color;
        this.bodyMaterial = bodyMaterial;
        this.price = price;
        this.volume = volume;
        this.power = power;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kettle kettle = (Kettle) o;

        if (price != kettle.price) return false;
        if (Double.compare(volume, kettle.volume) != 0) return false;
        if (power != kettle.power) return false;
        if (Double.compare(weight, kettle.weight) != 0) return false;
        if (!Objects.equals(model, kettle.model)) return false;
        if (!Objects.equals(color, kettle.color)) return false;
        return Objects.equals(bodyMaterial, kettle.bodyMaterial);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (bodyMaterial != null ? bodyMaterial.hashCode() : 0);
        result = 31 * result + price;
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + power;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", power=" + power +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Kettle o) {

        if(!this.model.equals(o.model)){
            return this.model.compareTo(o.model);
        }

        if(!this.color.equals(o.color)){
            return this.color.compareTo(o.color);
        }

        if(!this.bodyMaterial.equals(o.bodyMaterial)){
            return this.bodyMaterial.compareTo(o.bodyMaterial);
        }

        if(this.price != o.price){
            return this.price - o.price;
        }

        if(this.volume != o.volume){
            return Double.compare(this.volume, o.volume);
        }

        if(this.power != o.power){
            return this.power - o.power;
        }

        if(this.weight != o.weight){
            return Double.compare(this.weight, o.weight);
        }
        return 0;
    }
}
