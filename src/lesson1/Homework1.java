package lesson1;

public class Homework1 {
    public static void main(String[] args) {

        int money = 1000;
        int priceOfSnickers = 35;
        double priceOfCandy = 3.5;

        int countSnickersCanBuy = money / priceOfSnickers;
        int restOfMoneyAfterSnickersBuy = money - (countSnickersCanBuy * priceOfSnickers);

        int countCandyBuy = (int)(restOfMoneyAfterSnickersBuy / priceOfCandy);
        double restOfMoney = restOfMoneyAfterSnickersBuy - (countCandyBuy * priceOfCandy);

        System.out.println(countSnickersCanBuy);
        System.out.println(countCandyBuy);
        System.out.println(restOfMoney);
    }

}
