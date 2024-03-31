package lesson7.blackJack;

import java.util.ArrayList;

public class BlackJack {
    private ArrayList <Player> players = new ArrayList<>();

    public void addPlayerToGame (Player player) {

        players.add(player);
    }

    public void dealTwoCardsToAllPlayers (Koloda koloda){
        for (Player p: players) { // проходимся по всем игрокам (не важно есть ли там крупье)
            p.addCardToHand(koloda.getRandomCard());
        }
        for (Player p: players) { // проходимся по всем игрокам (не важно есть ли там крупье)
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    // метод, который будет раздавать все нужные карты всем игрокам
    // пока не скажут, что они им не нужны

    public void dealAllNeedCards(Koloda koloda){
        for (Player p:players){ //прохожусь по всем игрокам и крупье
            while (p.needMoreCards()) { // !!!! программа динамически подстраивается какой
                // !!!! тип объекта она взяла. И вызывает именно тот метод needMoreCards
                // !!!! в зависимости от того какой это объект
                // !!!! ПРОЯВЛЕНИЕ ПОЛИМОРФИЗМА
                p.addCardToHand(koloda.getRandomCard());

            }

        }

    }

    public void printWinner(){
        /**
         *   24    26    25    27 - победил крупье
         *   24    19    25    27 - победил у кого недобор
         *   21    21    21    27 - победили 3 человека
         *   18    18    25    12 - победил 2 у кого ближе к 21
         *   12    12    13    14 - победил 14
         */

        for(Player p: players){ // проходимся, устанавливаем флаг False тем кто не может претендовать на победу
            if(p.countBallInHand() > 21){
                p.setCanWinn(false);
            }
        }

        // если у всех перебор - выиграл крупье
        if (countPlayersWhoCanWinn() == 0){
            for (Player p: players){
                if(p instanceof Dealer){
                    System.out.println("Победил крупье!!! Его карты: ");
                    p.openHand();
                    return;

                }
            }
        }

        // если в игре остался только 1
        if (countPlayersWhoCanWinn() == 1){
            for (Player p: players){
                if(p.isCanWinn()){
                    System.out.println("Выиграл" + p.getName() + "Его карты: ");
                    p.openHand();
                    return;
                }
            }
        }

        int ballWinner = -1;
        for (Player p: players){
            if(p.isCanWinn() && p.countBallInHand() > ballWinner){
                ballWinner = p.countBallInHand();
            }
        }

        // узнали балл победителя, и печатаем тех игроков у кого такой балл (их может быть несколько)
        for (Player p: players){
            if (p.countBallInHand() == ballWinner){
                System.out.println("Победитель " + p.getName() + " ! Его карты: ");
                p.openHand();
            }
        }
    }

    private int countPlayersWhoCanWinn(){
        int count = 0;
        for(Player p: players){
            if(p.isCanWinn()){
                count++;
            }

        }
        return count;
    }


}
