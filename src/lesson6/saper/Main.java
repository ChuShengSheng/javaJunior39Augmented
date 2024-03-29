package lesson6.saper;

public class Main {
    public static void main(String[] args) {
        int level = UserInterface.getGameLevelFromUser();
        int[][] field = Saper.getFieldByGameLevel(level);
        Saper.fillMinesInField(level, field);
        Saper.printField(field);
    }

}
